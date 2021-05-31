package com.hrapovick.creational.abstractFactory.website;

import com.hrapovick.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website PM manages project...");
    }
}
