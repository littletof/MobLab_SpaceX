package hu.littletof.spacexwatcher.ui.launchlist;

import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.di.Network;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.ui.Presenter;
import hu.littletof.spacexwatcher.util.DateHelper;

import static hu.littletof.spacexwatcher.util.ListSeparator.titleLaunch;

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

                    if(screen != null) {
                        List a = launchesInteractor.getUpcomingLaunches();
                        screen.showLaunchesList(separateLiveLaunches(a));
                        Log.d("Launches", "Got " + a.size() + " upcoming launches.");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
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
}
