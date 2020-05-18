package hu.littletof.spacexwatcher.mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hu.littletof.spacexwatcher.model.LaunchSite;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.model.PastLaunch;
import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MockSpaceXWatcherApi implements SpaceXWatcherApi {

    @Override
    public Call<List<PastLaunch>> pastLaunches(){
        return null;
    }

    @Override
    public Call<List<UpcomingLaunch>> upcomingLaunches(){

        final List<UpcomingLaunch> fake= new ArrayList(){{
            UpcomingLaunch a = new UpcomingLaunch();
            a.setLaunchDateUtc("2006-03-24T22:30:00.000Z");
            a.setLaunchSite(new LaunchSite());
            add(a);
        }};

        return new Call<List<UpcomingLaunch>>() {
            @Override
            public Response<List<UpcomingLaunch>> execute() throws IOException {
                return Response.success(fake);
            }

            @Override
            public void enqueue(Callback<List<UpcomingLaunch>> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<List<UpcomingLaunch>> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }

            @Override
            public Timeout timeout() {
                return null;
            }
        };
    }

    @Override
    public Call<OneLaunch> oneLaunch(String flightNumber){
        final OneLaunch l = new OneLaunch();
        l.setMissionName("Test Mission");
        l.setLaunchSuccess(true);
        return new Call<OneLaunch>() {
            @Override
            public Response<OneLaunch> execute() throws IOException {
                return Response.success(l);
            }

            @Override
            public void enqueue(Callback<OneLaunch> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<OneLaunch> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }

            @Override
            public Timeout timeout() {
                return null;
            }
        };
    }
}
