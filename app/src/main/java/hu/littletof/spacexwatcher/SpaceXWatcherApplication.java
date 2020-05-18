package hu.littletof.spacexwatcher;

import android.app.Application;

import hu.littletof.spacexwatcher.network.NetworkModule;
import hu.littletof.spacexwatcher.repository.RepositoryModule;
import hu.littletof.spacexwatcher.ui.UIModule;

public class SpaceXWatcherApplication extends Application {
    public static SpaceXWatcherApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injectorInit();
    }

    public void injectorInit() {
        injector = DaggerSpaceXWatcherApplicationComponent.builder()
                // .uIModule(new UIModule(this))
                .repositoryModule(new RepositoryModule(this))
                .networkModule(new NetworkModule(this))
                .build();
    }
}
