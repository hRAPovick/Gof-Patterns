package com.hrapovick.creational.builder.easy;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildPrice();
    abstract void buildCms();

    Website getWebsite() {
        return website;
    }
}
