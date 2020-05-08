package hu.littletof.spacexwatcher.model;

import java.util.List;

public interface ILaunch {
    Integer getFlightNumber();
    void setFlightNumber(Integer flightNumber);

    String getMissionName();
    void setMissionName(String missionName);

    List<String> getMissionId();
    void setMissionId(List<String> missionId);

    Boolean getUpcoming();
    void setUpcoming(Boolean upcoming);

    String getLaunchYear();
    void setLaunchYear(String launchYear);

    Integer getLaunchDateUnix();
    void setLaunchDateUnix(Integer launchDateUnix);

    String getLaunchDateUtc();
    void setLaunchDateUtc(String launchDateUtc);

    String getLaunchDateLocal();
    void setLaunchDateLocal(String launchDateLocal);

    Boolean getIsTentative();
    void setIsTentative(Boolean isTentative);

    String getTentativeMaxPrecision();
    void setTentativeMaxPrecision(String tentativeMaxPrecision);

    Boolean getTbd();
    void setTbd(Boolean tbd);

    /*Integer getLaunchWindow();
    void setLaunchWindow(Integer launchWindow);*/

    Rocket getRocket();
    void setRocket(Rocket rocket);

    List<String> getShips();
    void setShips(List<String> ships);

    LaunchSite getLaunchSite();
    void setLaunchSite(LaunchSite launchSite);

    /*Boolean getLaunchSuccess();
    void setLaunchSuccess(Boolean launchSuccess);*/

    /*LaunchFailureDetails getLaunchFailureDetails();
    void setLaunchFailureDetails(LaunchFailureDetails launchFailureDetails);*/

    Links2 getLinks();
    void setLinks(Links2 links);

    String getDetails();
    void setDetails(String details);

    /*String getStaticFireDateUtc();
    void setStaticFireDateUtc(String staticFireDateUtc);

    Integer getStaticFireDateUnix();
    void setStaticFireDateUnix(Integer staticFireDateUnix);*/

    /*Timeline getTimeline();
    void setTimeline(Timeline timeline);*/
}
