package hu.littletof.spacexwatcher.model;


import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class PastLaunch implements ILaunch{

    @SerializedName("flight_number")
    private Integer flightNumber = null;

    @SerializedName("mission_name")
    private String missionName = null;

    @SerializedName("mission_id")
    private List<String> missionId = new ArrayList<String>();

    @SerializedName("upcoming")
    private Boolean upcoming = null;

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
    private Integer launchWindow = null;

    @SerializedName("rocket")
    private Rocket rocket = null;

    @SerializedName("ships")
    private List<String> ships = new ArrayList<String>();

    @SerializedName("launch_site")
    private LaunchSite launchSite = null;

    @SerializedName("launch_success")
    private Boolean launchSuccess = null;

    @SerializedName("launch_failure_details")
    private LaunchFailureDetails launchFailureDetails = null;

    @SerializedName("links")
    private Links2 links = null;

    @SerializedName("details")
    private String details = null;

    @SerializedName("static_fire_date_utc")
    private String staticFireDateUtc = null;

    @SerializedName("static_fire_date_unix")
    private Integer staticFireDateUnix = null;

    @SerializedName("timeline")
    private Timeline timeline = null;



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


    public Boolean getUpcoming() {
        return upcoming;
    }
    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
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


    public Integer getLaunchWindow() {
        return launchWindow;
    }
    public void setLaunchWindow(Integer launchWindow) {
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


    public Boolean getLaunchSuccess() {
        return launchSuccess;
    }
    public void setLaunchSuccess(Boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }


    public LaunchFailureDetails getLaunchFailureDetails() {
        return launchFailureDetails;
    }
    public void setLaunchFailureDetails(LaunchFailureDetails launchFailureDetails) {
        this.launchFailureDetails = launchFailureDetails;
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


    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }
    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }


    public Integer getStaticFireDateUnix() {
        return staticFireDateUnix;
    }
    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }


    public Timeline getTimeline() {
        return timeline;
    }
    public void setTimeline(Timeline timeline) {
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
        PastLaunch pastLaunch = (PastLaunch) o;
        return Objects.equals(flightNumber, pastLaunch.flightNumber) &&
                Objects.equals(missionName, pastLaunch.missionName) &&
                Objects.equals(missionId, pastLaunch.missionId) &&
                Objects.equals(upcoming, pastLaunch.upcoming) &&
                Objects.equals(launchYear, pastLaunch.launchYear) &&
                Objects.equals(launchDateUnix, pastLaunch.launchDateUnix) &&
                Objects.equals(launchDateUtc, pastLaunch.launchDateUtc) &&
                Objects.equals(launchDateLocal, pastLaunch.launchDateLocal) &&
                Objects.equals(isTentative, pastLaunch.isTentative) &&
                Objects.equals(tentativeMaxPrecision, pastLaunch.tentativeMaxPrecision) &&
                Objects.equals(tbd, pastLaunch.tbd) &&
                Objects.equals(launchWindow, pastLaunch.launchWindow) &&
                Objects.equals(rocket, pastLaunch.rocket) &&
                Objects.equals(ships, pastLaunch.ships) &&
                Objects.equals(launchSite, pastLaunch.launchSite) &&
                Objects.equals(launchSuccess, pastLaunch.launchSuccess) &&
                Objects.equals(launchFailureDetails, pastLaunch.launchFailureDetails) &&
                Objects.equals(links, pastLaunch.links) &&
                Objects.equals(details, pastLaunch.details) &&
                Objects.equals(staticFireDateUtc, pastLaunch.staticFireDateUtc) &&
                Objects.equals(staticFireDateUnix, pastLaunch.staticFireDateUnix) &&
                Objects.equals(timeline, pastLaunch.timeline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, missionName, missionId, upcoming, launchYear, launchDateUnix, launchDateUtc, launchDateLocal, isTentative, tentativeMaxPrecision, tbd, launchWindow, rocket, ships, launchSite, launchSuccess, launchFailureDetails, links, details, staticFireDateUtc, staticFireDateUnix, timeline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PastLaunch {\n");

        sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
        sb.append("    missionName: ").append(toIndentedString(missionName)).append("\n");
        sb.append("    missionId: ").append(toIndentedString(missionId)).append("\n");
        sb.append("    upcoming: ").append(toIndentedString(upcoming)).append("\n");
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
        sb.append("    launchFailureDetails: ").append(toIndentedString(launchFailureDetails)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

