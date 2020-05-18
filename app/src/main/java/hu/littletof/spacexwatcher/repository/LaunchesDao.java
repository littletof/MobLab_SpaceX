package hu.littletof.spacexwatcher.repository;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import hu.littletof.spacexwatcher.repository.model.UpcomingLaunch;

@Dao
public interface LaunchesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUpcomingLaunch(UpcomingLaunch upcomingLaunch);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAllUpcomingLaunches(List<UpcomingLaunch> upcomingLaunches);

    @Query("SELECT * FROM UpcomingLaunch")
    List<UpcomingLaunch> getAllUpcomingLaunches();

    @Query("DELETE FROM UpcomingLaunch")
    void clearUpcomingLaunches();
}
