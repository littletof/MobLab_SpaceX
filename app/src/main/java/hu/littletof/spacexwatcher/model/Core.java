package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class Core   {

    @SerializedName("core_serial")
    private String coreSerial = null;

    @SerializedName("flight")
    private Integer flight = null;

    @SerializedName("block")
    private String block = null;

    @SerializedName("gridfins")
    private Boolean gridfins = null;

    @SerializedName("legs")
    private Boolean legs = null;

    @SerializedName("reused")
    private Boolean reused = null;

    @SerializedName("land_success")
    private String landSuccess = null;

    @SerializedName("landing_intent")
    private Boolean landingIntent = null;

    @SerializedName("landing_type")
    private String landingType = null;

    @SerializedName("landing_vehicle")
    private String landingVehicle = null;


    public String getCoreSerial() {
        return coreSerial;
    }
    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    public Integer getFlight() {
        return flight;
    }
    public void setFlight(Integer flight) {
        this.flight = flight;
    }


    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }


    public Boolean getGridfins() {
        return gridfins;
    }
    public void setGridfins(Boolean gridfins) {
        this.gridfins = gridfins;
    }


    public Boolean getLegs() {
        return legs;
    }
    public void setLegs(Boolean legs) {
        this.legs = legs;
    }


    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }


    public String getLandSuccess() {
        return landSuccess;
    }
    public void setLandSuccess(String landSuccess) {
        this.landSuccess = landSuccess;
    }


    public Boolean getLandingIntent() {
        return landingIntent;
    }
    public void setLandingIntent(Boolean landingIntent) {
        this.landingIntent = landingIntent;
    }


    public String getLandingType() {
        return landingType;
    }
    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }


    public String getLandingVehicle() {
        return landingVehicle;
    }
    public void setLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Core core = (Core) o;
        return Objects.equals(coreSerial, core.coreSerial) &&
                Objects.equals(flight, core.flight) &&
                Objects.equals(block, core.block) &&
                Objects.equals(gridfins, core.gridfins) &&
                Objects.equals(legs, core.legs) &&
                Objects.equals(reused, core.reused) &&
                Objects.equals(landSuccess, core.landSuccess) &&
                Objects.equals(landingIntent, core.landingIntent) &&
                Objects.equals(landingType, core.landingType) &&
                Objects.equals(landingVehicle, core.landingVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreSerial, flight, block, gridfins, legs, reused, landSuccess, landingIntent, landingType, landingVehicle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Core {\n");

        sb.append("    coreSerial: ").append(toIndentedString(coreSerial)).append("\n");
        sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    gridfins: ").append(toIndentedString(gridfins)).append("\n");
        sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
        sb.append("    reused: ").append(toIndentedString(reused)).append("\n");
        sb.append("    landSuccess: ").append(toIndentedString(landSuccess)).append("\n");
        sb.append("    landingIntent: ").append(toIndentedString(landingIntent)).append("\n");
        sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
        sb.append("    landingVehicle: ").append(toIndentedString(landingVehicle)).append("\n");
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

