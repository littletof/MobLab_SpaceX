package hu.littletof.spacexwatcher.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

import hu.littletof.spacexwatcher.TestApplication;
import hu.littletof.spacexwatcher.interactor.LaunchesInteractor;
import hu.littletof.spacexwatcher.model.OneLaunch;
import hu.littletof.spacexwatcher.ui.launchdetails.LaunchDetailsActivity;
import hu.littletof.spacexwatcher.ui.launchdetails.LaunchDetailsPresenter;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(RobolectricTestRunner.class)
@Config(application = TestApplication.class)
public class LaunchDetailsPresenterTest {
    @Inject
    LaunchDetailsPresenter presenter;

    @Mock
    LaunchDetailsActivity mockActivity;

    @Before
    public void setup(){
        mockActivity = Mockito.mock(LaunchDetailsActivity.class);
        TestApplication.injector.inject(mockActivity);

        presenter = mockActivity.presenter;
        presenter.attachScreen(mockActivity);
    }

    @Test
    public void networkTest(){
        try {
            //Act
            presenter.getLaunchDetails("test");

            // Assert
            ArgumentCaptor<OneLaunch> argument = ArgumentCaptor.forClass(OneLaunch.class);
            verify(mockActivity, times(1)).showLaunchDetails(argument.capture());

            OneLaunch argumentValue = argument.getValue();
            Assert.assertTrue(argumentValue.getLaunchSuccess());
            Assert.assertEquals("Test Mission", argumentValue.getMissionName());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
