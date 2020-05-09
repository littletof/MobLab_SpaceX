package hu.littletof.spacexwatcher.ui.prevlaunches;

import java.util.List;

import hu.littletof.spacexwatcher.model.PastLaunch;

public interface PrevLaunchesScreen {
    void showPreviousLaunches(List<PastLaunch> launches);
}
