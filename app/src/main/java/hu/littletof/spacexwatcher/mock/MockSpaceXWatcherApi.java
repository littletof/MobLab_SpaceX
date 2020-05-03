package hu.littletof.spacexwatcher.mock;

import java.util.List;

import hu.littletof.spacexwatcher.model.AllLaunch;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.model.PastLaunch;
import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import retrofit2.Call;


public class MockSpaceXWatcherApi implements SpaceXWatcherApi {

    @Override
    public Call<List<AllLaunch>> allLaunches(){
        return null;
    }

    @Override
    public Call<List<PastLaunch>> pastLaunches(){
        return null;
    }

    @Override
    public Call<List<UpcomingLaunch>> upcomingLaunches(){
        return null;
    }

    @Override
    public Call<OneLaunch> oneLaunch(String flightNumber){
        return null;
    }
}
