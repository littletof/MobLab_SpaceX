package hu.littletof.spacexwatcher.ui.launchlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.ui.LaunchesAdapter;
import hu.littletof.spacexwatcher.ui.prevlaunches.PrevLaunchesActivity;


public class LaunchListActivity extends AppCompatActivity implements LaunchListScreen {
    @Inject
    public LaunchListPresenter presenter;

    private RecyclerView launchesRecycler;
    private List<UpcomingLaunch> launches;
    private LaunchesAdapter launchesAdapter;

    public LaunchListActivity() {
        SpaceXWatcherApplication.injector.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_list);

        launchesRecycler = findViewById(R.id.launches_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        launchesRecycler.setLayoutManager(llm);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(launchesRecycler.getContext(), llm.getOrientation());
        launchesRecycler.addItemDecoration(dividerItemDecoration);

        launches = new ArrayList<>();
        launchesAdapter = new LaunchesAdapter<UpcomingLaunch>(launches);
        launchesRecycler.setAdapter(launchesAdapter);

        getSupportActionBar().setTitle("SpaceX Watcher");
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getUpcomingLaunches();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.upcoming_launches_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.history_mi:
                startActivity (new Intent(this, PrevLaunchesActivity.class));
                break;
        }
        return true;
    }

    @Override
    public void showLaunchesList(final List<UpcomingLaunch> newLaunches) {
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                launches.clear();
                launches.addAll(newLaunches);
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
