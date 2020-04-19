package hu.littletof.spacexwatcher.interactor;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;

public class LaunchesInteractor {
    SpaceXWatcherApi spaceXWatcherApi;

    @Inject
    public LaunchesInteractor(SpaceXWatcherApi spaceXWatcherApi) {
        this.spaceXWatcherApi = spaceXWatcherApi;
    }
}
