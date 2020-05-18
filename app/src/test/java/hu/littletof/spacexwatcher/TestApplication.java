package hu.littletof.spacexwatcher;

import hu.littletof.spacexwatcher.mock.MockNetworkModule;
import hu.littletof.spacexwatcher.mock.MockRepositoryModule;
import hu.littletof.spacexwatcher.ui.UIModule;

public class TestApplication extends SpaceXWatcherApplication {
    @Override
    public void injectorInit() {
        injector = DaggerSpaceXWatcherApplicationComponent.builder()
                .uIModule(new UIModule(this))
                .repositoryModule(new MockRepositoryModule(this))
                .networkModule(new MockNetworkModule(this))
                .build();
    }
}
