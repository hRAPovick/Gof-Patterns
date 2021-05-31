package com.hrapovick.creational.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project copyOfProject() {
        return (Project) project.copy();
    }

}
