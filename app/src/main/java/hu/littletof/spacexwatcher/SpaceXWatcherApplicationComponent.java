package hu.littletof.spacexwatcher;

import javax.inject.Singleton;

import dagger.Component;
import hu.littletof.spacexwatcher.network.NetworkModule;
import hu.littletof.spacexwatcher.repository.RepositoryModule;
import hu.littletof.spacexwatcher.ui.UIModule;
import hu.littletof.spacexwatcher.ui.launchdetails.LaunchDetailsActivity;
import hu.littletof.spacexwatcher.ui.launchlist.LaunchListActivity;
import hu.littletof.spacexwatcher.ui.prevlaunches.PrevLaunchesActivity;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class, RepositoryModule.class})
public interface SpaceXWatcherApplicationComponent {
    void inject(PrevLaunchesActivity prevLaunchesActivity);
    void inject(LaunchListActivity launchListActivity);
    void inject(LaunchDetailsActivity detailsActivity);
}