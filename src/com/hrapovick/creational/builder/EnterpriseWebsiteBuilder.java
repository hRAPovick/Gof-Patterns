package com.hrapovick.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Enterprise card");
    }

    @Override
    void buildPrice() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildCms() {
        website.setPrice(10000);
    }
}
