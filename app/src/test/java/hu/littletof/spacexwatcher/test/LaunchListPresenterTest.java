package hu.littletof.spacexwatcher.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.TestApplication;
import hu.littletof.spacexwatcher.model.UpcomingLaunch;
import hu.littletof.spacexwatcher.ui.launchlist.LaunchListActivity;
import hu.littletof.spacexwatcher.ui.launchlist.LaunchListPresenter;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(application = TestApplication.class)
public class LaunchListPresenterTest {

    @Inject
    LaunchListPresenter presenter;

    @Mock
    LaunchListActivity mockActivity;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        TestApplication.injector.inject(mockActivity);

        presenter = mockActivity.presenter;
        presenter.attachScreen(mockActivity);
    }

    @Test
    public void networkTest(){
        try {
            //Act
            presenter.getUpcomingLaunches();

            // Assert
            ArgumentCaptor<List<UpcomingLaunch>> argument = ArgumentCaptor.forClass(List.class);
            verify(mockActivity, times(2)).showLaunchesList(argument.capture());

            List<UpcomingLaunch> argumentValue = argument.getValue();
            Assert.assertEquals(2, argumentValue.size());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
