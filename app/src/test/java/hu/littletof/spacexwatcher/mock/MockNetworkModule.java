package hu.littletof.spacexwatcher.mock;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.littletof.spacexwatcher.network.NetworkModule;
import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MockNetworkModule extends NetworkModule {
    public MockNetworkModule(Context context) {
        super(context);
    }

    @Override
    @Provides
    @Singleton
    public SpaceXWatcherApi provideSpaceXWatcherApi(Retrofit.Builder retrofitBuilder) {
        return new MockSpaceXWatcherApi();
    }
}
