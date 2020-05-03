package hu.littletof.spacexwatcher.network;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import hu.littletof.spacexwatcher.model.LaunchSite;
import hu.littletof.spacexwatcher.model.Links2;
import hu.littletof.spacexwatcher.model.Rocket;

public class UpcomingLaunch   {

    @SerializedName("flight_number")
    private Integer flightNumber = null;

    @SerializedName("mission_name")
    private String missionName = null;

    @SerializedName("mission_id")
    private List<String> missionId = new ArrayList<String>();

    @SerializedName("launch_year")
    private String launchYear = null;

    @SerializedName("launch_date_unix")
    private Integer launchDateUnix = null;

    @SerializedName("launch_date_utc")
    private String launchDateUtc = null;

    @SerializedName("launch_date_local")
    private String launchDateLocal = null;

    @SerializedName("is_tentative")
    private Boolean isTentative = null;

    @SerializedName("tentative_max_precision")
    private String tentativeMaxPrecision = null;

    @SerializedName("tbd")
    private Boolean tbd = null;

    @SerializedName("launch_window")
    private String launchWindow = null;

    @SerializedName("rocket")
    private Rocket rocket = null;

    @SerializedName("ships")
    private List<String> ships = new ArrayList<String>();

    @SerializedName("launch_site")
    private LaunchSite launchSite = null;

    @SerializedName("launch_success")
    private String launchSuccess = null;

    @SerializedName("links")
    private Links2 links = null;

    @SerializedName("details")
    private String details = null;

    @SerializedName("upcoming")
    private Boolean upcoming = null;

    @SerializedName("static_fire_date_utc")
    private String staticFireDateUtc = null;

    @SerializedName("static_fire_date_unix")
    private String staticFireDateUnix = null;

    @SerializedName("timeline")
    private String timeline = null;



    public Integer getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }


    public String getMissionName() {
        return missionName;
    }
    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }


    public List<String> getMissionId() {
        return missionId;
    }
    public void setMissionId(List<String> missionId) {
        this.missionId = missionId;
    }


    public String getLaunchYear() {
        return launchYear;
    }
    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }


    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }
    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }


    public String getLaunchDateUtc() {
        return launchDateUtc;
    }
    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }


    public String getLaunchDateLocal() {
        return launchDateLocal;
    }
    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }


    public Boolean getIsTentative() {
        return isTentative;
    }
    public void setIsTentative(Boolean isTentative) {
        this.isTentative = isTentative;
    }


    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }
    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }


    public Boolean getTbd() {
        return tbd;
    }
    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }


    public String getLaunchWindow() {
        return launchWindow;
    }
    public void setLaunchWindow(String launchWindow) {
        this.launchWindow = launchWindow;
    }


    public Rocket getRocket() {
        return rocket;
    }
    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }


    public List<String> getShips() {
        return ships;
    }
    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }
    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }


    public String getLaunchSuccess() {
        return launchSuccess;
    }
    public void setLaunchSuccess(String launchSuccess) {
        this.launchSuccess = launchSuccess;
    }


    public Links2 getLinks() {
        return links;
    }
    public void setLinks(Links2 links) {
        this.links = links;
    }


    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }


    public Boolean getUpcoming() {
        return upcoming;
    }
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }


    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }
    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }


    public String getStaticFireDateUnix() {
        return staticFireDateUnix;
    }
    public void setStaticFireDateUnix(String staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }


    public String getTimeline() {
        return timeline;
    }
    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpcomingLaunch upcomingLaunch = (UpcomingLaunch) o;
        return Objects.equals(flightNumber, upcomingLaunch.flightNumber) &&
                Objects.equals(missionName, upcomingLaunch.missionName) &&
                Objects.equals(missionId, upcomingLaunch.missionId) &&
                Objects.equals(launchYear, upcomingLaunch.launchYear) &&
                Objects.equals(launchDateUnix, upcomingLaunch.launchDateUnix) &&
                Objects.equals(launchDateUtc, upcomingLaunch.launchDateUtc) &&
                Objects.equals(launchDateLocal, upcomingLaunch.launchDateLocal) &&
                Objects.equals(isTentative, upcomingLaunch.isTentative) &&
                Objects.equals(tentativeMaxPrecision, upcomingLaunch.tentativeMaxPrecision) &&
                Objects.equals(tbd, upcomingLaunch.tbd) &&
                Objects.equals(launchWindow, upcomingLaunch.launchWindow) &&
                Objects.equals(rocket, upcomingLaunch.rocket) &&
                Objects.equals(ships, upcomingLaunch.ships) &&
                Objects.equals(launchSite, upcomingLaunch.launchSite) &&
                Objects.equals(launchSuccess, upcomingLaunch.launchSuccess) &&
                Objects.equals(links, upcomingLaunch.links) &&
                Objects.equals(details, upcomingLaunch.details) &&
                Objects.equals(upcoming, upcomingLaunch.upcoming) &&
                Objects.equals(staticFireDateUtc, upcomingLaunch.staticFireDateUtc) &&
                Objects.equals(staticFireDateUnix, upcomingLaunch.staticFireDateUnix) &&
                Objects.equals(timeline, upcomingLaunch.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, missionName, missionId, launchYear, launchDateUnix, launchDateUtc, launchDateLocal, isTentative, tentativeMaxPrecision, tbd, launchWindow, rocket, ships, launchSite, launchSuccess, links, details, upcoming, staticFireDateUtc, staticFireDateUnix, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpcomingLaunch {\n");

        sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
        sb.append("    missionName: ").append(toIndentedString(missionName)).append("\n");
        sb.append("    missionId: ").append(toIndentedString(missionId)).append("\n");
        sb.append("    launchYear: ").append(toIndentedString(launchYear)).append("\n");
        sb.append("    launchDateUnix: ").append(toIndentedString(launchDateUnix)).append("\n");
        sb.append("    launchDateUtc: ").append(toIndentedString(launchDateUtc)).append("\n");
        sb.append("    launchDateLocal: ").append(toIndentedString(launchDateLocal)).append("\n");
        sb.append("    isTentative: ").append(toIndentedString(isTentative)).append("\n");
        sb.append("    tentativeMaxPrecision: ").append(toIndentedString(tentativeMaxPrecision)).append("\n");
        sb.append("    tbd: ").append(toIndentedString(tbd)).append("\n");
        sb.append("    launchWindow: ").append(toIndentedString(launchWindow)).append("\n");
        sb.append("    rocket: ").append(toIndentedString(rocket)).append("\n");
        sb.append("    ships: ").append(toIndentedString(ships)).append("\n");
        sb.append("    launchSite: ").append(toIndentedString(launchSite)).append("\n");
        sb.append("    launchSuccess: ").append(toIndentedString(launchSuccess)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    upcoming: ").append(toIndentedString(upcoming)).append("\n");
        sb.append("    staticFireDateUtc: ").append(toIndentedString(staticFireDateUtc)).append("\n");
        sb.append("    staticFireDateUnix: ").append(toIndentedString(staticFireDateUnix)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

