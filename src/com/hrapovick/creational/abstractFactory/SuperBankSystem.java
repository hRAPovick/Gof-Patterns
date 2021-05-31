package com.hrapovick.creational.abstractFactory;

import com.hrapovick.creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory ptf = new BankingTeamFactory();
        Developer developer = ptf.getDeveloper();
        Tester tester = ptf.getTester();
        ProjectManager projectManager = ptf.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

