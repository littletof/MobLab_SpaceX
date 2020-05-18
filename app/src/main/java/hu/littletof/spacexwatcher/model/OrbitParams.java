package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


public class OrbitParams   {

    @SerializedName("reference_system")
    private String referenceSystem = null;

    @SerializedName("regime")
    private String regime = null;

    @SerializedName("longitude")
    private String longitude = null;

    @SerializedName("semi_major_axis_km")
    private String semiMajorAxisKm = null;

    @SerializedName("eccentricity")
    private String eccentricity = null;

    @SerializedName("periapsis_km")
    private Double periapsisKm = null;

    @SerializedName("apoapsis_km")
    private Double apoapsisKm = null;

    @SerializedName("inclination_deg")
    private Double inclinationDeg = null;

    @SerializedName("period_min")
    private String periodMin = null;

    @SerializedName("lifespan_years")
    private String lifespanYears = null;

    @SerializedName("epoch")
    private String epoch = null;

    @SerializedName("mean_motion")
    private String meanMotion = null;

    @SerializedName("raan")
    private String raan = null;

    @SerializedName("arg_of_pericenter")
    private String argOfPericenter = null;

    @SerializedName("mean_anomaly")
    private String meanAnomaly = null;

    public String getReferenceSystem() {
        return referenceSystem;
    }
    public void setReferenceSystem(String referenceSystem) {
        this.referenceSystem = referenceSystem;
    }
    public String getRegime() {
        return regime;
    }
    public void setRegime(String regime) {
        this.regime = regime;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }
    public void setSemiMajorAxisKm(String semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }
    public String getEccentricity() {
        return eccentricity;
    }
    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }
    public Double getPeriapsisKm() {
        return periapsisKm;
    }
    public void setPeriapsisKm(Double periapsisKm) {
        this.periapsisKm = periapsisKm;
    }
    public Double getApoapsisKm() {
        return apoapsisKm;
    }
    public void setApoapsisKm(Double apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }
    public Double getInclinationDeg() {
        return inclinationDeg;
    }
    public void setInclinationDeg(Double inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }
    public String getPeriodMin() {
        return periodMin;
    }
    public void setPeriodMin(String periodMin) {
        this.periodMin = periodMin;
    }
    public String getLifespanYears() {
        return lifespanYears;
    }
    public void setLifespanYears(String lifespanYears) {
        this.lifespanYears = lifespanYears;
    }
    public String getEpoch() {
        return epoch;
    }
    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }
    public String getMeanMotion() {
        return meanMotion;
    }
    public void setMeanMotion(String meanMotion) {
        this.meanMotion = meanMotion;
    }
    public String getRaan() {
        return raan;
    }
    public void setRaan(String raan) {
        this.raan = raan;
    }
    public String getArgOfPericenter() {
        return argOfPericenter;
    }
    public void setArgOfPericenter(String argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }
    public String getMeanAnomaly() {
        return meanAnomaly;
    }
    public void setMeanAnomaly(String meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrbitParams orbitParams = (OrbitParams) o;
        return Objects.equals(referenceSystem, orbitParams.referenceSystem) &&
                Objects.equals(regime, orbitParams.regime) &&
                Objects.equals(longitude, orbitParams.longitude) &&
                Objects.equals(semiMajorAxisKm, orbitParams.semiMajorAxisKm) &&
                Objects.equals(eccentricity, orbitParams.eccentricity) &&
                Objects.equals(periapsisKm, orbitParams.periapsisKm) &&
                Objects.equals(apoapsisKm, orbitParams.apoapsisKm) &&
                Objects.equals(inclinationDeg, orbitParams.inclinationDeg) &&
                Objects.equals(periodMin, orbitParams.periodMin) &&
                Objects.equals(lifespanYears, orbitParams.lifespanYears) &&
                Objects.equals(epoch, orbitParams.epoch) &&
                Objects.equals(meanMotion, orbitParams.meanMotion) &&
                Objects.equals(raan, orbitParams.raan) &&
                Objects.equals(argOfPericenter, orbitParams.argOfPericenter) &&
                Objects.equals(meanAnomaly, orbitParams.meanAnomaly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceSystem, regime, longitude, semiMajorAxisKm, eccentricity, periapsisKm, apoapsisKm, inclinationDeg, periodMin, lifespanYears, epoch, meanMotion, raan, argOfPericenter, meanAnomaly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrbitParams {\n");

        sb.append("    referenceSystem: ").append(toIndentedString(referenceSystem)).append("\n");
        sb.append("    regime: ").append(toIndentedString(regime)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    semiMajorAxisKm: ").append(toIndentedString(semiMajorAxisKm)).append("\n");
        sb.append("    eccentricity: ").append(toIndentedString(eccentricity)).append("\n");
        sb.append("    periapsisKm: ").append(toIndentedString(periapsisKm)).append("\n");
        sb.append("    apoapsisKm: ").append(toIndentedString(apoapsisKm)).append("\n");
        sb.append("    inclinationDeg: ").append(toIndentedString(inclinationDeg)).append("\n");
        sb.append("    periodMin: ").append(toIndentedString(periodMin)).append("\n");
        sb.append("    lifespanYears: ").append(toIndentedString(lifespanYears)).append("\n");
        sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
        sb.append("    meanMotion: ").append(toIndentedString(meanMotion)).append("\n");
        sb.append("    raan: ").append(toIndentedString(raan)).append("\n");
        sb.append("    argOfPericenter: ").append(toIndentedString(argOfPericenter)).append("\n");
        sb.append("    meanAnomaly: ").append(toIndentedString(meanAnomaly)).append("\n");
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

