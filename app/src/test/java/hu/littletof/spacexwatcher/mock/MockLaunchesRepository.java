package hu.littletof.spacexwatcher.mock;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import hu.littletof.spacexwatcher.repository.LaunchesRepository;
import hu.littletof.spacexwatcher.repository.model.UpcomingLaunch;

public class MockLaunchesRepository extends LaunchesRepository {

    List<UpcomingLaunch> mockRepo = new ArrayList<UpcomingLaunch>();
    public MockLaunchesRepository(Context context) {
        super(context);
    }

    @Override
    public List<UpcomingLaunch> getAllUpcomingLaunches() {
        return mockRepo;
    }

    @Override
    public void insertUpcomingLaunch(UpcomingLaunch upcomingLaunch) {
        mockRepo.add(upcomingLaunch);
    }

    @Override
    public void insertAllUpcomingLaunches(List<UpcomingLaunch> upcomingLaunches) {
        mockRepo.addAll(upcomingLaunches);
    }

    @Override
    public void clearUpcomingLaunches() {
        mockRepo.clear();
    }
}
