package com.hrapovick.creational.abstractFactory.website;

import com.hrapovick.creational.abstractFactory.Developer;
import com.hrapovick.creational.abstractFactory.ProjectManager;
import com.hrapovick.creational.abstractFactory.ProjectTeamFactory;
import com.hrapovick.creational.abstractFactory.Tester;
import com.hrapovick.creational.abstractFactory.banking.BankingPM;
import com.hrapovick.creational.abstractFactory.banking.JavaDeveloper;
import com.hrapovick.creational.abstractFactory.banking.QATester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}