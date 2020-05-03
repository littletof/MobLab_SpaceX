package hu.littletof.spacexwatcher.mock;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.littletof.spacexwatcher.network.SpaceXWatcherApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class MockNetworkModule {
    private Context context;

    public MockNetworkModule(Context context) { this.context = context; }

    @Provides
    @Singleton
    public SpaceXWatcherApi provideSpaceXWatcherApi() {
        return new MockSpaceXWatcherApi();
    }

    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create());

    }
}
