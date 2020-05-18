package hu.littletof.spacexwatcher.mock;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.littletof.spacexwatcher.repository.LaunchesRepository;
import hu.littletof.spacexwatcher.repository.RepositoryModule;

@Module
public class MockRepositoryModule extends RepositoryModule {
    public MockRepositoryModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @Singleton
    public LaunchesRepository provideRepository() { return new MockLaunchesRepository(context);}
}
