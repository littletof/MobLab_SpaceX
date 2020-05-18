package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Rocket   {

    @SerializedName("rocket_id")
    private String rocketId = null;

    @SerializedName("rocket_name")
    private String rocketName = null;

    @SerializedName("rocket_type")
    private String rocketType = null;

    @SerializedName("first_stage")
    private FirstStage firstStage = null;

    @SerializedName("second_stage")
    private SecondStage secondStage = null;

    @SerializedName("fairings")
    private Fairings fairings = null;


    public String getRocketId() {
        return rocketId;
    }
    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }


    public String getRocketName() {
        return rocketName;
    }
    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }


    public String getRocketType() {
        return rocketType;
    }
    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }


    public FirstStage getFirstStage() {
        return firstStage;
    }
    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }


    public SecondStage getSecondStage() {
        return secondStage;
    }
    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }


    public Fairings getFairings() {
        return fairings;
    }
    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rocket rocket = (Rocket) o;
        return Objects.equals(rocketId, rocket.rocketId) &&
                Objects.equals(rocketName, rocket.rocketName) &&
                Objects.equals(rocketType, rocket.rocketType) &&
                Objects.equals(firstStage, rocket.firstStage) &&
                Objects.equals(secondStage, rocket.secondStage) &&
                Objects.equals(fairings, rocket.fairings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rocketId, rocketName, rocketType, firstStage, secondStage, fairings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rocket {\n");

        sb.append("    rocketId: ").append(toIndentedString(rocketId)).append("\n");
        sb.append("    rocketName: ").append(toIndentedString(rocketName)).append("\n");
        sb.append("    rocketType: ").append(toIndentedString(rocketType)).append("\n");
        sb.append("    firstStage: ").append(toIndentedString(firstStage)).append("\n");
        sb.append("    secondStage: ").append(toIndentedString(secondStage)).append("\n");
        sb.append("    fairings: ").append(toIndentedString(fairings)).append("\n");
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

