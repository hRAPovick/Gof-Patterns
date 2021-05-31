package com.hrapovick.creational.builder.easy;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildPrice() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildCms() {
        website.setPrice(500);
    }
}
