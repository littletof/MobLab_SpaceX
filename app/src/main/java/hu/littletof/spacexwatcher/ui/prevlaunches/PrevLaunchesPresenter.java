package hu.littletof.spacexwatcher.ui.prevlaunches;

import android.util.Log;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.di.Network;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.ui.Presenter;

public class PrevLaunchesPresenter extends Presenter<PrevLaunchesScreen> {

    LaunchesInteractor launchesInteractor;
    Executor networkExecutor;

    @Inject
    public PrevLaunchesPresenter(@Network Executor networkExecutor, LaunchesInteractor launchesInteractor){
        this.launchesInteractor = launchesInteractor;
        this.networkExecutor = networkExecutor;
    }

    public void getPreviousLaunches() {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {

                    if(screen != null) {
                        List a = launchesInteractor.getPastLaunches();
                        screen.showPreviousLaunches(a);
                        Log.d("Launches", "Got " + a.size() + " past launches.");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
