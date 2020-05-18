package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class Fairings   {

    @SerializedName("reused")
    private Boolean reused = null;

    @SerializedName("recovery_attempt")
    private Boolean recoveryAttempt = null;

    @SerializedName("recovered")
    private Boolean recovered = null;

    @SerializedName("ship")
    private String ship = null;


    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }


    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }
    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }


    public Boolean getRecovered() {
        return recovered;
    }
    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }


    public String getShip() {
        return ship;
    }
    public void setShip(String ship) {
        this.ship = ship;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fairings fairings = (Fairings) o;
        return Objects.equals(reused, fairings.reused) &&
                Objects.equals(recoveryAttempt, fairings.recoveryAttempt) &&
                Objects.equals(recovered, fairings.recovered) &&
                Objects.equals(ship, fairings.ship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reused, recoveryAttempt, recovered, ship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fairings {\n");

        sb.append("    reused: ").append(toIndentedString(reused)).append("\n");
        sb.append("    recoveryAttempt: ").append(toIndentedString(recoveryAttempt)).append("\n");
        sb.append("    recovered: ").append(toIndentedString(recovered)).append("\n");
        sb.append("    ship: ").append(toIndentedString(ship)).append("\n");
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

