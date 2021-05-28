package com.hrapovick.creational.abstractFactory;

import com.hrapovick.creational.abstractFactory.banking.BankingTeamFactory;
import com.hrapovick.creational.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory ptf = new WebsiteTeamFactory();
        Developer developer = ptf.getDeveloper();
        Tester tester = ptf.getTester();
        ProjectManager projectManager = ptf.getProjectManager();

        System.out.println("Creating website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
