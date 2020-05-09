package hu.littletof.spacexwatcher.repository;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    private Context context;

    public RepositoryModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public LaunchesRepository provideRepository() { return new LaunchesRepository(context);}
}
