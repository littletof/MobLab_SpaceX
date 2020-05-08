package hu.littletof.spacexwatcher.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Payload   {

    @SerializedName("payload_id")
    private String payloadId = null;

    @SerializedName("norad_id")
    private List<String> noradId = new ArrayList<String>();

    @SerializedName("reused")
    private Boolean reused = null;

    @SerializedName("customers")
    private List<String> customers = new ArrayList<String>();

    @SerializedName("nationality")
    private String nationality = null;

    @SerializedName("manufacturer")
    private String manufacturer = null;

    @SerializedName("payload_type")
    private String payloadType = null;

    @SerializedName("payload_mass_kg")
    private Double payloadMassKg = null;

    @SerializedName("payload_mass_lbs")
    private Double payloadMassLbs = null;

    @SerializedName("orbit")
    private String orbit = null;

    @SerializedName("orbit_params")
    private OrbitParams orbitParams = null;

    @SerializedName("cap_serial")
    private String capSerial = null;

    @SerializedName("mass_returned_kg")
    private String massReturnedKg = null;

    @SerializedName("mass_returned_lbs")
    private String massReturnedLbs = null;

    @SerializedName("flight_time_sec")
    private Integer flightTimeSec = null;

    @SerializedName("cargo_manifest")
    private String cargoManifest = null;



    public String getPayloadId() {
        return payloadId;
    }
    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }


    public List<String> getNoradId() {
        return noradId;
    }
    public void setNoradId(List<String> noradId) {
        this.noradId = noradId;
    }


    public Boolean getReused() {
        return reused;
    }
    public void setReused(Boolean reused) {
        this.reused = reused;
    }


    public List<String> getCustomers() {
        return customers;
    }
    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }


    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public String getPayloadType() {
        return payloadType;
    }
    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }


    public Double getPayloadMassKg() {
        return payloadMassKg;
    }
    public void setPayloadMassKg(Double payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }


    public Double getPayloadMassLbs() {
        return payloadMassLbs;
    }
    public void setPayloadMassLbs(Double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }


    public String getOrbit() {
        return orbit;
    }
    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }


    public OrbitParams getOrbitParams() {
        return orbitParams;
    }
    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
    }


    public String getCapSerial() {
        return capSerial;
    }
    public void setCapSerial(String capSerial) {
        this.capSerial = capSerial;
    }


    public String getMassReturnedKg() {
        return massReturnedKg;
    }
    public void setMassReturnedKg(String massReturnedKg) {
        this.massReturnedKg = massReturnedKg;
    }


    public String getMassReturnedLbs() {
        return massReturnedLbs;
    }
    public void setMassReturnedLbs(String massReturnedLbs) {
        this.massReturnedLbs = massReturnedLbs;
    }


    public Integer getFlightTimeSec() {
        return flightTimeSec;
    }
    public void setFlightTimeSec(Integer flightTimeSec) {
        this.flightTimeSec = flightTimeSec;
    }


    public String getCargoManifest() {
        return cargoManifest;
    }
    public void setCargoManifest(String cargoManifest) {
        this.cargoManifest = cargoManifest;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Payload payload = (Payload) o;
        return Objects.equals(payloadId, payload.payloadId) &&
                Objects.equals(noradId, payload.noradId) &&
                Objects.equals(reused, payload.reused) &&
                Objects.equals(customers, payload.customers) &&
                Objects.equals(nationality, payload.nationality) &&
                Objects.equals(manufacturer, payload.manufacturer) &&
                Objects.equals(payloadType, payload.payloadType) &&
                Objects.equals(payloadMassKg, payload.payloadMassKg) &&
                Objects.equals(payloadMassLbs, payload.payloadMassLbs) &&
                Objects.equals(orbit, payload.orbit) &&
                Objects.equals(orbitParams, payload.orbitParams) &&
                Objects.equals(capSerial, payload.capSerial) &&
                Objects.equals(massReturnedKg, payload.massReturnedKg) &&
                Objects.equals(massReturnedLbs, payload.massReturnedLbs) &&
                Objects.equals(flightTimeSec, payload.flightTimeSec) &&
                Objects.equals(cargoManifest, payload.cargoManifest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payloadId, noradId, reused, customers, nationality, manufacturer, payloadType, payloadMassKg, payloadMassLbs, orbit, orbitParams, capSerial, massReturnedKg, massReturnedLbs, flightTimeSec, cargoManifest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Payload {\n");

        sb.append("    payloadId: ").append(toIndentedString(payloadId)).append("\n");
        sb.append("    noradId: ").append(toIndentedString(noradId)).append("\n");
        sb.append("    reused: ").append(toIndentedString(reused)).append("\n");
        sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
        sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
        sb.append("    payloadMassKg: ").append(toIndentedString(payloadMassKg)).append("\n");
        sb.append("    payloadMassLbs: ").append(toIndentedString(payloadMassLbs)).append("\n");
        sb.append("    orbit: ").append(toIndentedString(orbit)).append("\n");
        sb.append("    orbitParams: ").append(toIndentedString(orbitParams)).append("\n");
        sb.append("    capSerial: ").append(toIndentedString(capSerial)).append("\n");
        sb.append("    massReturnedKg: ").append(toIndentedString(massReturnedKg)).append("\n");
        sb.append("    massReturnedLbs: ").append(toIndentedString(massReturnedLbs)).append("\n");
        sb.append("    flightTimeSec: ").append(toIndentedString(flightTimeSec)).append("\n");
        sb.append("    cargoManifest: ").append(toIndentedString(cargoManifest)).append("\n");
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

