package hu.littletof.spacexwatcher.model;


import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class Timeline   {

    @SerializedName("webcast_liftoff")
    private Integer webcastLiftoff = null;

    @SerializedName("go_for_prop_loading")
    private Integer goForPropLoading = null;

    @SerializedName("rp1_loading")
    private Integer rp1Loading = null;

    @SerializedName("stage1_lox_loading")
    private Integer stage1LoxLoading = null;

    @SerializedName("stage2_lox_loading")
    private Integer stage2LoxLoading = null;

    @SerializedName("engine_chill")
    private Integer engineChill = null;

    @SerializedName("prelaunch_checks")
    private Integer prelaunchChecks = null;

    @SerializedName("propellant_pressurization")
    private Integer propellantPressurization = null;

    @SerializedName("go_for_launch")
    private Integer goForLaunch = null;

    @SerializedName("ignition")
    private Integer ignition = null;

    @SerializedName("liftoff")
    private Integer liftoff = null;

    @SerializedName("maxq")
    private Integer maxq = null;

    @SerializedName("meco")
    private Integer meco = null;

    @SerializedName("stage_sep")
    private Integer stageSep = null;

    @SerializedName("second_stage_ignition")
    private Integer secondStageIgnition = null;

    @SerializedName("seco-1")
    private Integer seco1 = null;

    @SerializedName("dragon_separation")
    private Integer dragonSeparation = null;

    @SerializedName("dragon_solar_deploy")
    private Integer dragonSolarDeploy = null;

    @SerializedName("dragon_bay_door_deploy")
    private Integer dragonBayDoorDeploy = null;

    @SerializedName("fairing_deploy")
    private Integer fairingDeploy = null;

    @SerializedName("payload_deploy")
    private Integer payloadDeploy = null;

    @SerializedName("second_stage_restart")
    private Integer secondStageRestart = null;

    @SerializedName("seco-2")
    private Integer seco2 = null;

    @SerializedName("webcast_launch")
    private Integer webcastLaunch = null;

    @SerializedName("payload_deploy_1")
    private Integer payloadDeploy1 = null;

    @SerializedName("payload_deploy_2")
    private Integer payloadDeploy2 = null;

    @SerializedName("first_stage_boostback_burn")
    private Integer firstStageBoostbackBurn = null;

    @SerializedName("first_stage_entry_burn")
    private Integer firstStageEntryBurn = null;

    @SerializedName("first_stage_landing")
    private Integer firstStageLanding = null;

    @SerializedName("beco")
    private Integer beco = null;

    @SerializedName("side_core_sep")
    private Integer sideCoreSep = null;

    @SerializedName("side_core_boostback")
    private Integer sideCoreBoostback = null;

    @SerializedName("center_stage_sep")
    private Integer centerStageSep = null;

    @SerializedName("center_core_boostback")
    private Integer centerCoreBoostback = null;

    @SerializedName("side_core_entry_burn")
    private Integer sideCoreEntryBurn = null;

    @SerializedName("center_core_entry_burn")
    private Integer centerCoreEntryBurn = null;

    @SerializedName("side_core_landing")
    private Integer sideCoreLanding = null;

    @SerializedName("center_core_landing")
    private Integer centerCoreLanding = null;



    public Integer getWebcastLiftoff() {
        return webcastLiftoff;
    }
    public void setWebcastLiftoff(Integer webcastLiftoff) {
        this.webcastLiftoff = webcastLiftoff;
    }


    public Integer getGoForPropLoading() {
        return goForPropLoading;
    }
    public void setGoForPropLoading(Integer goForPropLoading) {
        this.goForPropLoading = goForPropLoading;
    }


    public Integer getRp1Loading() {
        return rp1Loading;
    }
    public void setRp1Loading(Integer rp1Loading) {
        this.rp1Loading = rp1Loading;
    }


    public Integer getStage1LoxLoading() {
        return stage1LoxLoading;
    }
    public void setStage1LoxLoading(Integer stage1LoxLoading) {
        this.stage1LoxLoading = stage1LoxLoading;
    }


    public Integer getStage2LoxLoading() {
        return stage2LoxLoading;
    }
    public void setStage2LoxLoading(Integer stage2LoxLoading) {
        this.stage2LoxLoading = stage2LoxLoading;
    }


    public Integer getEngineChill() {
        return engineChill;
    }
    public void setEngineChill(Integer engineChill) {
        this.engineChill = engineChill;
    }


    public Integer getPrelaunchChecks() {
        return prelaunchChecks;
    }
    public void setPrelaunchChecks(Integer prelaunchChecks) {
        this.prelaunchChecks = prelaunchChecks;
    }


    public Integer getPropellantPressurization() {
        return propellantPressurization;
    }
    public void setPropellantPressurization(Integer propellantPressurization) {
        this.propellantPressurization = propellantPressurization;
    }


    public Integer getGoForLaunch() {
        return goForLaunch;
    }
    public void setGoForLaunch(Integer goForLaunch) {
        this.goForLaunch = goForLaunch;
    }


    public Integer getIgnition() {
        return ignition;
    }
    public void setIgnition(Integer ignition) {
        this.ignition = ignition;
    }


    public Integer getLiftoff() {
        return liftoff;
    }
    public void setLiftoff(Integer liftoff) {
        this.liftoff = liftoff;
    }


    public Integer getMaxq() {
        return maxq;
    }
    public void setMaxq(Integer maxq) {
        this.maxq = maxq;
    }


    public Integer getMeco() {
        return meco;
    }
    public void setMeco(Integer meco) {
        this.meco = meco;
    }


    public Integer getStageSep() {
        return stageSep;
    }
    public void setStageSep(Integer stageSep) {
        this.stageSep = stageSep;
    }


    public Integer getSecondStageIgnition() {
        return secondStageIgnition;
    }
    public void setSecondStageIgnition(Integer secondStageIgnition) {
        this.secondStageIgnition = secondStageIgnition;
    }


    public Integer getSeco1() {
        return seco1;
    }
    public void setSeco1(Integer seco1) {
        this.seco1 = seco1;
    }


    public Integer getDragonSeparation() {
        return dragonSeparation;
    }
    public void setDragonSeparation(Integer dragonSeparation) {
        this.dragonSeparation = dragonSeparation;
    }


    public Integer getDragonSolarDeploy() {
        return dragonSolarDeploy;
    }
    public void setDragonSolarDeploy(Integer dragonSolarDeploy) {
        this.dragonSolarDeploy = dragonSolarDeploy;
    }


    public Integer getDragonBayDoorDeploy() {
        return dragonBayDoorDeploy;
    }
    public void setDragonBayDoorDeploy(Integer dragonBayDoorDeploy) {
        this.dragonBayDoorDeploy = dragonBayDoorDeploy;
    }


    public Integer getFairingDeploy() {
        return fairingDeploy;
    }
    public void setFairingDeploy(Integer fairingDeploy) {
        this.fairingDeploy = fairingDeploy;
    }


    public Integer getPayloadDeploy() {
        return payloadDeploy;
    }
    public void setPayloadDeploy(Integer payloadDeploy) {
        this.payloadDeploy = payloadDeploy;
    }


    public Integer getSecondStageRestart() {
        return secondStageRestart;
    }
    public void setSecondStageRestart(Integer secondStageRestart) {
        this.secondStageRestart = secondStageRestart;
    }


    public Integer getSeco2() {
        return seco2;
    }
    public void setSeco2(Integer seco2) {
        this.seco2 = seco2;
    }


    public Integer getWebcastLaunch() {
        return webcastLaunch;
    }
    public void setWebcastLaunch(Integer webcastLaunch) {
        this.webcastLaunch = webcastLaunch;
    }


    public Integer getPayloadDeploy1() {
        return payloadDeploy1;
    }
    public void setPayloadDeploy1(Integer payloadDeploy1) {
        this.payloadDeploy1 = payloadDeploy1;
    }


    public Integer getPayloadDeploy2() {
        return payloadDeploy2;
    }
    public void setPayloadDeploy2(Integer payloadDeploy2) {
        this.payloadDeploy2 = payloadDeploy2;
    }


    public Integer getFirstStageBoostbackBurn() {
        return firstStageBoostbackBurn;
    }
    public void setFirstStageBoostbackBurn(Integer firstStageBoostbackBurn) {
        this.firstStageBoostbackBurn = firstStageBoostbackBurn;
    }


    public Integer getFirstStageEntryBurn() {
        return firstStageEntryBurn;
    }
    public void setFirstStageEntryBurn(Integer firstStageEntryBurn) {
        this.firstStageEntryBurn = firstStageEntryBurn;
    }


    public Integer getFirstStageLanding() {
        return firstStageLanding;
    }
    public void setFirstStageLanding(Integer firstStageLanding) {
        this.firstStageLanding = firstStageLanding;
    }


    public Integer getBeco() {
        return beco;
    }
    public void setBeco(Integer beco) {
        this.beco = beco;
    }


    public Integer getSideCoreSep() {
        return sideCoreSep;
    }
    public void setSideCoreSep(Integer sideCoreSep) {
        this.sideCoreSep = sideCoreSep;
    }


    public Integer getSideCoreBoostback() {
        return sideCoreBoostback;
    }
    public void setSideCoreBoostback(Integer sideCoreBoostback) {
        this.sideCoreBoostback = sideCoreBoostback;
    }


    public Integer getCenterStageSep() {
        return centerStageSep;
    }
    public void setCenterStageSep(Integer centerStageSep) {
        this.centerStageSep = centerStageSep;
    }


    public Integer getCenterCoreBoostback() {
        return centerCoreBoostback;
    }
    public void setCenterCoreBoostback(Integer centerCoreBoostback) {
        this.centerCoreBoostback = centerCoreBoostback;
    }


    public Integer getSideCoreEntryBurn() {
        return sideCoreEntryBurn;
    }
    public void setSideCoreEntryBurn(Integer sideCoreEntryBurn) {
        this.sideCoreEntryBurn = sideCoreEntryBurn;
    }


    public Integer getCenterCoreEntryBurn() {
        return centerCoreEntryBurn;
    }
    public void setCenterCoreEntryBurn(Integer centerCoreEntryBurn) {
        this.centerCoreEntryBurn = centerCoreEntryBurn;
    }


    public Integer getSideCoreLanding() {
        return sideCoreLanding;
    }
    public void setSideCoreLanding(Integer sideCoreLanding) {
        this.sideCoreLanding = sideCoreLanding;
    }


    public Integer getCenterCoreLanding() {
        return centerCoreLanding;
    }
    public void setCenterCoreLanding(Integer centerCoreLanding) {
        this.centerCoreLanding = centerCoreLanding;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Timeline timeline = (Timeline) o;
        return Objects.equals(webcastLiftoff, timeline.webcastLiftoff) &&
                Objects.equals(goForPropLoading, timeline.goForPropLoading) &&
                Objects.equals(rp1Loading, timeline.rp1Loading) &&
                Objects.equals(stage1LoxLoading, timeline.stage1LoxLoading) &&
                Objects.equals(stage2LoxLoading, timeline.stage2LoxLoading) &&
                Objects.equals(engineChill, timeline.engineChill) &&
                Objects.equals(prelaunchChecks, timeline.prelaunchChecks) &&
                Objects.equals(propellantPressurization, timeline.propellantPressurization) &&
                Objects.equals(goForLaunch, timeline.goForLaunch) &&
                Objects.equals(ignition, timeline.ignition) &&
                Objects.equals(liftoff, timeline.liftoff) &&
                Objects.equals(maxq, timeline.maxq) &&
                Objects.equals(meco, timeline.meco) &&
                Objects.equals(stageSep, timeline.stageSep) &&
                Objects.equals(secondStageIgnition, timeline.secondStageIgnition) &&
                Objects.equals(seco1, timeline.seco1) &&
                Objects.equals(dragonSeparation, timeline.dragonSeparation) &&
                Objects.equals(dragonSolarDeploy, timeline.dragonSolarDeploy) &&
                Objects.equals(dragonBayDoorDeploy, timeline.dragonBayDoorDeploy) &&
                Objects.equals(fairingDeploy, timeline.fairingDeploy) &&
                Objects.equals(payloadDeploy, timeline.payloadDeploy) &&
                Objects.equals(secondStageRestart, timeline.secondStageRestart) &&
                Objects.equals(seco2, timeline.seco2) &&
                Objects.equals(webcastLaunch, timeline.webcastLaunch) &&
                Objects.equals(payloadDeploy1, timeline.payloadDeploy1) &&
                Objects.equals(payloadDeploy2, timeline.payloadDeploy2) &&
                Objects.equals(firstStageBoostbackBurn, timeline.firstStageBoostbackBurn) &&
                Objects.equals(firstStageEntryBurn, timeline.firstStageEntryBurn) &&
                Objects.equals(firstStageLanding, timeline.firstStageLanding) &&
                Objects.equals(beco, timeline.beco) &&
                Objects.equals(sideCoreSep, timeline.sideCoreSep) &&
                Objects.equals(sideCoreBoostback, timeline.sideCoreBoostback) &&
                Objects.equals(centerStageSep, timeline.centerStageSep) &&
                Objects.equals(centerCoreBoostback, timeline.centerCoreBoostback) &&
                Objects.equals(sideCoreEntryBurn, timeline.sideCoreEntryBurn) &&
                Objects.equals(centerCoreEntryBurn, timeline.centerCoreEntryBurn) &&
                Objects.equals(sideCoreLanding, timeline.sideCoreLanding) &&
                Objects.equals(centerCoreLanding, timeline.centerCoreLanding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webcastLiftoff, goForPropLoading, rp1Loading, stage1LoxLoading, stage2LoxLoading, engineChill, prelaunchChecks, propellantPressurization, goForLaunch, ignition, liftoff, maxq, meco, stageSep, secondStageIgnition, seco1, dragonSeparation, dragonSolarDeploy, dragonBayDoorDeploy, fairingDeploy, payloadDeploy, secondStageRestart, seco2, webcastLaunch, payloadDeploy1, payloadDeploy2, firstStageBoostbackBurn, firstStageEntryBurn, firstStageLanding, beco, sideCoreSep, sideCoreBoostback, centerStageSep, centerCoreBoostback, sideCoreEntryBurn, centerCoreEntryBurn, sideCoreLanding, centerCoreLanding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Timeline {\n");

        sb.append("    webcastLiftoff: ").append(toIndentedString(webcastLiftoff)).append("\n");
        sb.append("    goForPropLoading: ").append(toIndentedString(goForPropLoading)).append("\n");
        sb.append("    rp1Loading: ").append(toIndentedString(rp1Loading)).append("\n");
        sb.append("    stage1LoxLoading: ").append(toIndentedString(stage1LoxLoading)).append("\n");
        sb.append("    stage2LoxLoading: ").append(toIndentedString(stage2LoxLoading)).append("\n");
        sb.append("    engineChill: ").append(toIndentedString(engineChill)).append("\n");
        sb.append("    prelaunchChecks: ").append(toIndentedString(prelaunchChecks)).append("\n");
        sb.append("    propellantPressurization: ").append(toIndentedString(propellantPressurization)).append("\n");
        sb.append("    goForLaunch: ").append(toIndentedString(goForLaunch)).append("\n");
        sb.append("    ignition: ").append(toIndentedString(ignition)).append("\n");
        sb.append("    liftoff: ").append(toIndentedString(liftoff)).append("\n");
        sb.append("    maxq: ").append(toIndentedString(maxq)).append("\n");
        sb.append("    meco: ").append(toIndentedString(meco)).append("\n");
        sb.append("    stageSep: ").append(toIndentedString(stageSep)).append("\n");
        sb.append("    secondStageIgnition: ").append(toIndentedString(secondStageIgnition)).append("\n");
        sb.append("    seco1: ").append(toIndentedString(seco1)).append("\n");
        sb.append("    dragonSeparation: ").append(toIndentedString(dragonSeparation)).append("\n");
        sb.append("    dragonSolarDeploy: ").append(toIndentedString(dragonSolarDeploy)).append("\n");
        sb.append("    dragonBayDoorDeploy: ").append(toIndentedString(dragonBayDoorDeploy)).append("\n");
        sb.append("    fairingDeploy: ").append(toIndentedString(fairingDeploy)).append("\n");
        sb.append("    payloadDeploy: ").append(toIndentedString(payloadDeploy)).append("\n");
        sb.append("    secondStageRestart: ").append(toIndentedString(secondStageRestart)).append("\n");
        sb.append("    seco2: ").append(toIndentedString(seco2)).append("\n");
        sb.append("    webcastLaunch: ").append(toIndentedString(webcastLaunch)).append("\n");
        sb.append("    payloadDeploy1: ").append(toIndentedString(payloadDeploy1)).append("\n");
        sb.append("    payloadDeploy2: ").append(toIndentedString(payloadDeploy2)).append("\n");
        sb.append("    firstStageBoostbackBurn: ").append(toIndentedString(firstStageBoostbackBurn)).append("\n");
        sb.append("    firstStageEntryBurn: ").append(toIndentedString(firstStageEntryBurn)).append("\n");
        sb.append("    firstStageLanding: ").append(toIndentedString(firstStageLanding)).append("\n");
        sb.append("    beco: ").append(toIndentedString(beco)).append("\n");
        sb.append("    sideCoreSep: ").append(toIndentedString(sideCoreSep)).append("\n");
        sb.append("    sideCoreBoostback: ").append(toIndentedString(sideCoreBoostback)).append("\n");
        sb.append("    centerStageSep: ").append(toIndentedString(centerStageSep)).append("\n");
        sb.append("    centerCoreBoostback: ").append(toIndentedString(centerCoreBoostback)).append("\n");
        sb.append("    sideCoreEntryBurn: ").append(toIndentedString(sideCoreEntryBurn)).append("\n");
        sb.append("    centerCoreEntryBurn: ").append(toIndentedString(centerCoreEntryBurn)).append("\n");
        sb.append("    sideCoreLanding: ").append(toIndentedString(sideCoreLanding)).append("\n");
        sb.append("    centerCoreLanding: ").append(toIndentedString(centerCoreLanding)).append("\n");
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

