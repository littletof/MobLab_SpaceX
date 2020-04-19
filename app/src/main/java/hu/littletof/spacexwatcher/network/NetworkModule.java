package hu.littletof.spacexwatcher.network;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {
    private Context context;

    public NetworkModule(Context context) { this.context = context; }

    @Provides
    @Singleton
    public SpaceXWatcherApi provideSpaceXWatcherApi() { throw new RuntimeException();}
}
