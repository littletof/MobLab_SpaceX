package hu.littletof.spacexwatcher.ui.prevlaunches;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;
import hu.littletof.spacexwatcher.model.PastLaunch;
import hu.littletof.spacexwatcher.ui.LaunchesAdapter;
import hu.littletof.spacexwatcher.ui.launchlist.LaunchListActivity;


public class PrevLaunchesActivity extends AppCompatActivity implements PrevLaunchesScreen {
    @Inject
    PrevLaunchesPresenter presenter;

    private RecyclerView launchesRecycler;
    private List<PastLaunch> launches;
    private LaunchesAdapter launchesAdapter;

    public PrevLaunchesActivity() { SpaceXWatcherApplication.injector.inject(this); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_launches);

        launchesRecycler = findViewById(R.id.launches_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        launchesRecycler.setLayoutManager(llm);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(launchesRecycler.getContext(), llm.getOrientation());
        launchesRecycler.addItemDecoration(dividerItemDecoration);

        launches = new ArrayList<>();
        launchesAdapter = new LaunchesAdapter<PastLaunch>(launches);
        launchesRecycler.setAdapter(launchesAdapter);

        getSupportActionBar().setTitle("Previous launches");
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getPreviousLaunches();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.past_launches_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.current_mi:
                startActivity (new Intent(this, LaunchListActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
                break;
        }
        return true;
    }

    @Override
    public void showPreviousLaunches(final List<PastLaunch> pastLaunches) {
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                launches.clear();
                launches.addAll(pastLaunches);
                launchesAdapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachScreen();
    }
}
