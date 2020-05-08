package hu.littletof.spacexwatcher.ui.launchlist;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.di.Network;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.ui.Presenter;

public class LaunchListPresenter extends Presenter<LaunchListScreen> {

    LaunchesInteractor launchesInteractor;
    Executor networkExecutor;

    @Inject
    public LaunchListPresenter(@Network Executor networkExecutor, LaunchesInteractor launchesInteractor){
        this.launchesInteractor = launchesInteractor;
        this.networkExecutor = networkExecutor;
    }

    public void getUpcomingLaunches() {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    List a = launchesInteractor.getUpcomingLaunches();
                    Log.d("me", a.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
