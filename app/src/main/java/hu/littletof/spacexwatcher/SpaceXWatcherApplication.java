package hu.littletof.spacexwatcher;

import android.app.Application;

import hu.littletof.spacexwatcher.network.NetworkModule;
import hu.littletof.spacexwatcher.repository.RepositoryModule;

public class SpaceXWatcherApplication extends Application {
    public static SpaceXWatcherApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = DaggerSpaceXWatcherApplicationComponent.builder()
                .repositoryModule(new RepositoryModule(this))
                .networkModule(new NetworkModule(this))
                .build();
    }
}
