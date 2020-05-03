package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class LaunchFailureDetails   {

    @SerializedName("time")
    private Integer time = null;

    @SerializedName("altitude")
    private String altitude = null;

    @SerializedName("reason")
    private String reason = null;


    public Integer getTime() {
        return time;
    }
    public void setTime(Integer time) {
        this.time = time;
    }


    public String getAltitude() {
        return altitude;
    }
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchFailureDetails launchFailureDetails = (LaunchFailureDetails) o;
        return Objects.equals(time, launchFailureDetails.time) &&
                Objects.equals(altitude, launchFailureDetails.altitude) &&
                Objects.equals(reason, launchFailureDetails.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, altitude, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchFailureDetails {\n");

        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

