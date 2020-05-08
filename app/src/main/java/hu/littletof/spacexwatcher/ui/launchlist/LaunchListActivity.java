package hu.littletof.spacexwatcher.ui.launchlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.SpaceXWatcherApplication;


public class LaunchListActivity extends AppCompatActivity implements LaunchListScreen {
    @Inject
    LaunchListPresenter presenter;

    public LaunchListActivity() {
        SpaceXWatcherApplication.injector.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_list);
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.getUpcomingLaunches();
    }

    @Override
    public void showLaunchesList() {

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
