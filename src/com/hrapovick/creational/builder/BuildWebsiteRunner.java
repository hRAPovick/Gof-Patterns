package com.hrapovick.creational.builder;

import java.nio.file.DirectoryStream;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website2 = director.buildWebsite();

        System.out.println(website2);
    }
}
