package hu.littletof.spacexwatcher.repository;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import hu.littletof.spacexwatcher.repository.model.UpcomingLaunch;

@Database(entities = UpcomingLaunch.class, version = 2, exportSchema = false)
public abstract class LaunchesDatabase extends RoomDatabase {
    public abstract LaunchesDao launchesDao();
}
