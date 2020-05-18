package hu.littletof.spacexwatcher.ui.launchlist;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.R;
import hu.littletof.spacexwatcher.di.Network;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.repository.LaunchesRepository;
import hu.littletof.spacexwatcher.ui.Presenter;
import hu.littletof.spacexwatcher.util.DateHelper;

import static hu.littletof.spacexwatcher.util.ListSeparator.titleLaunch;

public class LaunchListPresenter extends Presenter<LaunchListScreen> {

    LaunchesInteractor launchesInteractor;
    LaunchesRepository launchesRepository;
    Executor networkExecutor;

    @Inject
    public LaunchListPresenter(/*@Network Executor networkExecutor, */LaunchesInteractor launchesInteractor, LaunchesRepository launchesRepository){
        this.launchesInteractor = launchesInteractor;
        this.networkExecutor = networkExecutor;
        this.launchesRepository = launchesRepository;
    }

    public void getUpcomingLaunches() {
        ArrayList<UpcomingLaunch> dbList = new ArrayList<>();
        for(hu.littletof.spacexwatcher.repository.model.UpcomingLaunch ul : launchesRepository.getAllUpcomingLaunches()){
            dbList.add(ul.toEntity());
        }
        screen.showLaunchesList(separateLiveLaunches(dbList));


        /*networkExecutor.execute(new Runnable() {
            @Override
            public void run() {*/
                try {

                    if(screen != null) {
                        List<UpcomingLaunch> a = launchesInteractor.getUpcomingLaunches();
                        screen.showLaunchesList(separateLiveLaunches(a));
                        Log.d("Launches", "Got " + a.size() + " upcoming launches.");

                        ArrayList<hu.littletof.spacexwatcher.repository.model.UpcomingLaunch> dbListTo = new ArrayList<>();
                        for(UpcomingLaunch ul : a){
                            dbListTo.add(hu.littletof.spacexwatcher.repository.model.UpcomingLaunch.fromEntity(ul));
                        }
                        launchesRepository.clearUpcomingLaunches();
                        launchesRepository.insertAllUpcomingLaunches(dbListTo);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
           /* }
        });*/
    }

    private List<UpcomingLaunch> separateLiveLaunches(List<UpcomingLaunch> launches) {
        List<UpcomingLaunch> live = new ArrayList<>();
        List<UpcomingLaunch> up = new ArrayList<>();

        for(UpcomingLaunch ul : launches) {
            if(DateHelper.considerLiveLaunch(ul)) {
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
