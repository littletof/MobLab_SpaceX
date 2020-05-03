package hu.littletof.spacexwatcher.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class SecondStage   {

    @SerializedName("block")
    private Integer block = null;

    @SerializedName("payloads")
    private List<Payload> payloads = new ArrayList<Payload>();


    public Integer getBlock() {
        return block;
    }
    public void setBlock(Integer block) {
        this.block = block;
    }


    public List<Payload> getPayloads() {
        return payloads;
    }
    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecondStage secondStage = (SecondStage) o;
        return Objects.equals(block, secondStage.block) &&
                Objects.equals(payloads, secondStage.payloads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, payloads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecondStage {\n");

        sb.append("    block: ").append(toIndentedString(block)).append("\n");
        sb.append("    payloads: ").append(toIndentedString(payloads)).append("\n");
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

