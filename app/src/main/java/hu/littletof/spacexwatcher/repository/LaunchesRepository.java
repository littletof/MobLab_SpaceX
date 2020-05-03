package hu.littletof.spacexwatcher.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import androidx.room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.repository.model.UpcomingLaunch;

public class LaunchesRepository {
    @Inject
    Context context;

    private LaunchesDatabase launchesDatabase;


    public LaunchesRepository(){
        launchesDatabase = Room.databaseBuilder(context, LaunchesDatabase.class, "launches_db").build();
    }

    @SuppressLint("StaticFieldLeak")
    List<UpcomingLaunch> getAllUpcomingLaunches() {
        try {
            return new AsyncTask<Void, Void, List<UpcomingLaunch>>(){

                @Override
                protected List<UpcomingLaunch> doInBackground(Void... voids) {
                    return launchesDatabase.launchesDao().getAllUpcomingLaunches();
                }
            }.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ArrayList<UpcomingLaunch>();
    }

    @SuppressLint("StaticFieldLeak")
    void insertUpcomingLaunch(final UpcomingLaunch upcomingLaunch) {
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                launchesDatabase.launchesDao().insertUpcomingLaunch(upcomingLaunch);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    void insertAllUpcomingLaunches(final List<UpcomingLaunch> upcomingLaunches) {
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                launchesDatabase.launchesDao().insertAllUpcomingLaunches(upcomingLaunches);
                return null;
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    void clearUpcomingLaunches() {
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... voids) {
                launchesDatabase.launchesDao().clearUpcomingLaunches();
                return null;
            }
        }.execute();
    }
}
