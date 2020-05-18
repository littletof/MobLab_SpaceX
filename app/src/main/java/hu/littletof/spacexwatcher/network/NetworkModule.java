package hu.littletof.spacexwatcher.network;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {
    private Context context;

    public NetworkModule(Context context) { this.context = context; }

    @Provides
    @Singleton
    public SpaceXWatcherApi provideSpaceXWatcherApi(Retrofit.Builder retrofitBuilder) {
        return retrofitBuilder.baseUrl(NetworkConfiguration.SPACEXWATCHER_API_URL).build().create(SpaceXWatcherApi.class);
    }

    @Provides
    @Singleton
    public Retrofit.Builder provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create());

    }
}
