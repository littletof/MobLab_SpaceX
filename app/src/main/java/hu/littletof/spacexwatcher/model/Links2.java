package hu.littletof.spacexwatcher.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Links2   {

    @SerializedName("mission_patch")
    private String missionPatch = null;

    @SerializedName("mission_patch_small")
    private String missionPatchSmall = null;

    @SerializedName("reddit_campaign")
    private String redditCampaign = null;

    @SerializedName("reddit_launch")
    private String redditLaunch = null;

    @SerializedName("reddit_recovery")
    private String redditRecovery = null;

    @SerializedName("reddit_media")
    private String redditMedia = null;

    @SerializedName("presskit")
    private String presskit = null;

    @SerializedName("article_link")
    private String articleLink = null;

    @SerializedName("wikipedia")
    private String wikipedia = null;

    @SerializedName("video_link")
    private String videoLink = null;

    @SerializedName("youtube_id")
    private String youtubeId = null;

    @SerializedName("flickr_images")
    private List<String> flickrImages = new ArrayList<String>();



    public String getMissionPatch() {
        return missionPatch;
    }
    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }


    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }
    public void setMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }


    public String getRedditCampaign() {
        return redditCampaign;
    }
    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }


    public String getRedditLaunch() {
        return redditLaunch;
    }
    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }


    public String getRedditRecovery() {
        return redditRecovery;
    }
    public void setRedditRecovery(String redditRecovery) {
        this.redditRecovery = redditRecovery;
    }


    public String getRedditMedia() {
        return redditMedia;
    }
    public void setRedditMedia(String redditMedia) {
        this.redditMedia = redditMedia;
    }


    public String getPresskit() {
        return presskit;
    }
    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }


    public String getArticleLink() {
        return articleLink;
    }
    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }


    public String getWikipedia() {
        return wikipedia;
    }
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }


    public String getVideoLink() {
        return videoLink;
    }
    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }


    public String getYoutubeId() {
        return youtubeId;
    }
    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }


    public List<String> getFlickrImages() {
        return flickrImages;
    }
    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Links2 links2 = (Links2) o;
        return Objects.equals(missionPatch, links2.missionPatch) &&
                Objects.equals(missionPatchSmall, links2.missionPatchSmall) &&
                Objects.equals(redditCampaign, links2.redditCampaign) &&
                Objects.equals(redditLaunch, links2.redditLaunch) &&
                Objects.equals(redditRecovery, links2.redditRecovery) &&
                Objects.equals(redditMedia, links2.redditMedia) &&
                Objects.equals(presskit, links2.presskit) &&
                Objects.equals(articleLink, links2.articleLink) &&
                Objects.equals(wikipedia, links2.wikipedia) &&
                Objects.equals(videoLink, links2.videoLink) &&
                Objects.equals(youtubeId, links2.youtubeId) &&
                Objects.equals(flickrImages, links2.flickrImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionPatch, missionPatchSmall, redditCampaign, redditLaunch, redditRecovery, redditMedia, presskit, articleLink, wikipedia, videoLink, youtubeId, flickrImages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Links2 {\n");

        sb.append("    missionPatch: ").append(toIndentedString(missionPatch)).append("\n");
        sb.append("    missionPatchSmall: ").append(toIndentedString(missionPatchSmall)).append("\n");
        sb.append("    redditCampaign: ").append(toIndentedString(redditCampaign)).append("\n");
        sb.append("    redditLaunch: ").append(toIndentedString(redditLaunch)).append("\n");
        sb.append("    redditRecovery: ").append(toIndentedString(redditRecovery)).append("\n");
        sb.append("    redditMedia: ").append(toIndentedString(redditMedia)).append("\n");
        sb.append("    presskit: ").append(toIndentedString(presskit)).append("\n");
        sb.append("    articleLink: ").append(toIndentedString(articleLink)).append("\n");
        sb.append("    wikipedia: ").append(toIndentedString(wikipedia)).append("\n");
        sb.append("    videoLink: ").append(toIndentedString(videoLink)).append("\n");
        sb.append("    youtubeId: ").append(toIndentedString(youtubeId)).append("\n");
        sb.append("    flickrImages: ").append(toIndentedString(flickrImages)).append("\n");
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

