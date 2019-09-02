package com.example.carousel_bs1;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class View {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("subtitle")
    @Expose
    public Object subtitle;
    @SerializedName("priority")
    @Expose
    public Integer priority;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("seourl")
    @Expose
    public Object seourl;
    @SerializedName("items")
    @Expose
    public List<Item> items = null;
    @SerializedName("landingPageMetaFlag")
    @Expose
    public Integer landingPageMetaFlag;
    @SerializedName("start_time")
    @Expose
    public Object startTime;
    @SerializedName("end_time")
    @Expose
    public Object endTime;
    @SerializedName("manage_by_engage")
    @Expose
    public Integer manageByEngage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getSeourl() {
        return seourl;
    }

    public void setSeourl(Object seourl) {
        this.seourl = seourl;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public Integer getLandingPageMetaFlag() {
        return landingPageMetaFlag;
    }

    public void setLandingPageMetaFlag(Integer landingPageMetaFlag) {
        this.landingPageMetaFlag = landingPageMetaFlag;
    }

    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    public Integer getManageByEngage() {
        return manageByEngage;
    }

    public void setManageByEngage(Integer manageByEngage) {
        this.manageByEngage = manageByEngage;
    }

}