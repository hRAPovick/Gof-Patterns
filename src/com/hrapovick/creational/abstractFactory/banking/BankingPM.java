package com.hrapovick.creational.abstractFactory.banking;

import com.hrapovick.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
