package hu.littletof.spacexwatcher.repository.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UpcomingLaunch {
    @PrimaryKey
    private Integer flightNumber;

    private String missionName;

    private String launchDateUtc;

    private String description;



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

}
