package hu.littletof.spacexwatcher.ui.launchlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;
import hu.littletof.spacexwatcher.model.ILaunch;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.ui.LaunchesAdapter;
import hu.littletof.spacexwatcher.util.DateHelper;


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
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(launchesRecycler.getContext(), llm.getOrientation());
        launchesRecycler.addItemDecoration(dividerItemDecoration);

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
        final List<UpcomingLaunch> viewList = separateLiveLaunches(newLaunches);
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                launches.clear();
                launches.addAll(viewList);
                launchesAdapter.notifyDataSetChanged();
            }
        });
    }

    private List<UpcomingLaunch> separateLiveLaunches(List<UpcomingLaunch> launches) {
        List<UpcomingLaunch> live = new ArrayList<>();
        List<UpcomingLaunch> up = new ArrayList<>();

        Date now = new Date();

        for(UpcomingLaunch ul : launches) {
            if(Math.abs(DateHelper.getDate(ul.getLaunchDateUtc()).getTime() - now.getTime()) <= 2*60*60*1000) {
                live.add(ul);
            } else {
                up.add(ul);
            }
        }

        List<UpcomingLaunch> merged = new ArrayList<>();
        if(live.size() > 0) {
            merged.add(titleLaunch("Live launches", R.drawable.live_icon));
            merged.addAll(live);
        }
        merged.add(titleLaunch("Upcoming launches",0));
        merged.addAll(up);

        return merged;
    }

    private UpcomingLaunch titleLaunch(String title, int icon) {
        UpcomingLaunch sep = new UpcomingLaunch();
        sep.setLaunchDateUnix(-9);
        sep.setMissionName(title);
        sep.setFlightNumber(icon);
        return sep;
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
