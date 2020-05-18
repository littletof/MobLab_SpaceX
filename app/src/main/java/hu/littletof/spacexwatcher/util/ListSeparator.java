package hu.littletof.spacexwatcher.util;

import hu.littletof.spacexwatcher.model.UpcomingLaunch;

public class ListSeparator {
    public static UpcomingLaunch titleLaunch(String title, int icon) {
        UpcomingLaunch sep = new UpcomingLaunch();
        sep.setLaunchDateUnix(-9);
        sep.setMissionName(title);
        sep.setFlightNumber(icon);
        return sep;
    }
}
