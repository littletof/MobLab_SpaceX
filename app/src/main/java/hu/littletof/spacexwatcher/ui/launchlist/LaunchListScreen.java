package hu.littletof.spacexwatcher.ui.launchlist;

import java.util.List;

import hu.littletof.spacexwatcher.model.UpcomingLaunch;

public interface LaunchListScreen {
    void showLaunchesList(List<UpcomingLaunch> launches);
}
