package hu.littletof.spacexwatcher.interactor;

import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.model.AllLaunch;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.model.PastLaunch;
import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import retrofit2.Call;
import retrofit2.Response;

public class LaunchesInteractor {
    SpaceXWatcherApi spaceXWatcherApi;

    @Inject
    public LaunchesInteractor(SpaceXWatcherApi spaceXWatcherApi) {
        this.spaceXWatcherApi = spaceXWatcherApi;
    }

    public List<AllLaunch> getAllLaunches() throws Exception{
        Call<List<AllLaunch>> allLaunchesCall = spaceXWatcherApi.allLaunches();
        Response<List<AllLaunch>> resp = allLaunchesCall.execute();

        if(resp.code() != 200) {
            throw new Exception("Getting allLaunches failed with: " + resp.code());
        }

        return resp.body();
    }

    public List<PastLaunch> getPastLaunches() throws Exception{
        Call<List<PastLaunch>> pastLaunchesCall = spaceXWatcherApi.pastLaunches();
        Response<List<PastLaunch>> resp = pastLaunchesCall.execute();

        if(resp.code() != 200) {
            throw new Exception("Getting pastLaunches failed with: " + resp.code());
        }

        return resp.body();
    }

    public List<UpcomingLaunch> getUpcomingLaunches() throws Exception{
        Call<List<UpcomingLaunch>> upcomingLaunchesCall = spaceXWatcherApi.upcomingLaunches();
        Response<List<UpcomingLaunch>> resp = upcomingLaunchesCall.execute();

        if(resp.code() != 200) {
            throw new Exception("Getting upcomingLaunches failed with: " + resp.code());
        }

        return resp.body();
    }

    public OneLaunch getOneLaunch(String flightNumber) throws Exception{
        Call<OneLaunch> oneLaunchCall = spaceXWatcherApi.oneLaunch(flightNumber);
        Response<OneLaunch> resp = oneLaunchCall.execute();

        if(resp.code() != 200) {
            throw new Exception("Getting oneLaunch failed with: " + resp.code());
        }

        return resp.body();
    }
}
