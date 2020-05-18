package hu.littletof.spacexwatcher.repository.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import hu.littletof.spacexwatcher.model.LaunchSite;

@Entity
public class UpcomingLaunch {
    @PrimaryKey
    private Integer flightNumber;

    private String missionName;

    private String launchDateUtc;

    private String description;

    private String siteName;



    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public hu.littletof.spacexwatcher.model.UpcomingLaunch toEntity() {
        hu.littletof.spacexwatcher.model.UpcomingLaunch ul = new hu.littletof.spacexwatcher.model.UpcomingLaunch();
        ul.setFlightNumber(flightNumber);
        ul.setMissionName(missionName);
        ul.setLaunchDateUtc(launchDateUtc);
        ul.setDetails(description);
        LaunchSite ls = new LaunchSite();
        ls.setSiteName(siteName);
        ul.setLaunchSite(ls);
        ul.setLaunchDateUnix(0);

        return ul;
    }

    public static UpcomingLaunch fromEntity(hu.littletof.spacexwatcher.model.UpcomingLaunch ul){
        UpcomingLaunch rul = new UpcomingLaunch();
        rul.flightNumber = ul.getFlightNumber();
        rul.missionName = ul.getMissionName();
        rul.launchDateUtc = ul.getLaunchDateUtc();
        rul.description = ul.getDetails();
        rul.siteName = ul.getLaunchSite().getSiteName();
        return rul;
    }

}
