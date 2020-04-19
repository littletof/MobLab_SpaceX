package hu.littletof.spacexwatcher.ui.launchlist;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;


public class LaunchListActivity extends AppCompatActivity implements LaunchListScreen {
    @Inject
    LaunchListPresenter presenter;

    @Override
    public void showLaunchesList() {

    }

    @Override
    public void updateLaunchesListItem() {

    }
}
