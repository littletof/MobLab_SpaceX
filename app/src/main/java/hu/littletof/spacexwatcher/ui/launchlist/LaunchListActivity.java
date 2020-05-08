package hu.littletof.spacexwatcher.ui.launchlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.ui.LaunchesAdapter;


public class LaunchListActivity extends AppCompatActivity implements LaunchListScreen {
    @Inject
    LaunchListPresenter presenter;

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

        launches = new ArrayList<>();
        launchesAdapter = new LaunchesAdapter<UpcomingLaunch>(launches);
        launchesRecycler.setAdapter(launchesAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getUpcomingLaunches();
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
    public void updateLaunchesListItem() {

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
