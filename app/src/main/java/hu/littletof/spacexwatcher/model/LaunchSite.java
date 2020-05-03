package hu.littletof.spacexwatcher.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class LaunchSite   {

    @SerializedName("site_id")
    private String siteId = null;

    @SerializedName("site_name")
    private String siteName = null;

    @SerializedName("site_name_long")
    private String siteNameLong = null;



    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }


    public String getSiteName() {
        return siteName;
    }
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }


    public String getSiteNameLong() {
        return siteNameLong;
    }
    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchSite launchSite = (LaunchSite) o;
        return Objects.equals(siteId, launchSite.siteId) &&
                Objects.equals(siteName, launchSite.siteName) &&
                Objects.equals(siteNameLong, launchSite.siteNameLong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, siteName, siteNameLong);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchSite {\n");

        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
        sb.append("    siteNameLong: ").append(toIndentedString(siteNameLong)).append("\n");
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

