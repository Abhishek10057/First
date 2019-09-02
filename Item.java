package com.example.carousel_bs1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("priority")
    @Expose
    public Integer priority;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("title")
    @Expose
    public Object title;
    @SerializedName("subtitle")
    @Expose
    public Object subtitle;
    @SerializedName("image_url")
    @Expose
    public String imageUrl;
    @SerializedName("alt_image_url")
    @Expose
    public Object altImageUrl;
    @SerializedName("url_info")
    @Expose
    public String urlInfo;
    @SerializedName("url_type")
    @Expose
    public String urlType;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("item_id")
    @Expose
    public Integer itemId;
    @SerializedName("ga_category")
    @Expose
    public String gaCategory;
    @SerializedName("start_time")
    @Expose
    public Object startTime;
    @SerializedName("end_time")
    @Expose
    public Object endTime;
    @SerializedName("seourl")
    @Expose
    public String seourl;
    @SerializedName("newurl")
    @Expose
    public String newurl;
    @SerializedName("reason")
    @Expose
    public Object reason;
    @SerializedName("url_key")
    @Expose
    public String urlKey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getAltImageUrl() {
        return altImageUrl;
    }

    public void setAltImageUrl(Object altImageUrl) {
        this.altImageUrl = altImageUrl;
    }

    public String getUrlInfo() {
        return urlInfo;
    }

    public void setUrlInfo(String urlInfo) {
        this.urlInfo = urlInfo;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getGaCategory() {
        return gaCategory;
    }

    public void setGaCategory(String gaCategory) {
        this.gaCategory = gaCategory;
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


    public String getSeourl() {
        return seourl;
    }

    public void setSeourl(String seourl) {
        this.seourl = seourl;
    }

    public String getNewurl() {
        return newurl;
    }

    public void setNewurl(String newurl) {
        this.newurl = newurl;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

}