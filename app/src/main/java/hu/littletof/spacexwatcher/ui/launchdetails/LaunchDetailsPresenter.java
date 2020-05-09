package hu.littletof.spacexwatcher.ui.launchdetails;

import android.util.Log;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.di.Network;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.ui.Presenter;

public class LaunchDetailsPresenter extends Presenter<LaunchDetailsScreen> {

    LaunchesInteractor launchesInteractor;
    Executor networkExecutor;

    @Inject
    public LaunchDetailsPresenter(@Network Executor networkExecutor, LaunchesInteractor launchesInteractor){
        this.launchesInteractor = launchesInteractor;
        this.networkExecutor = networkExecutor;
    }

    public void getLaunchDetails(final String flightNumber) {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {

                    if(screen != null) {
                        OneLaunch a = launchesInteractor.getOneLaunch(flightNumber);
                        screen.showLaunchDetails(a);
                        Log.d("Launches", "Got launch" + flightNumber + ".");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}