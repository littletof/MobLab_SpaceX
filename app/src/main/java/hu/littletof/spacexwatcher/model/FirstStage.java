package hu.littletof.spacexwatcher.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class FirstStage   {

    @SerializedName("cores")
    private List<Core> cores = new ArrayList<Core>();

    public List<Core> getCores() {
        return cores;
    }
    public void setCores(List<Core> cores) {
        this.cores = cores;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FirstStage firstStage = (FirstStage) o;
        return Objects.equals(cores, firstStage.cores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirstStage {\n");

        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
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
