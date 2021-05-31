package com.hrapovick.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Easy Project Prototype", "Source code");

        System.out.println(master);

        // Не самый лучший способ
        Project masterClone = (Project) master.copy();
        System.out.println("\n===========================\n");
        System.out.println(masterClone);
        System.out.println(master != masterClone);

        // Копируем объект через фабрику
        ProjectFactory factory = new ProjectFactory(master);
        Project factoryClone = factory.copyOfProject();
        System.out.println("\n===========================\n");
        System.out.println(factoryClone);
        System.out.println(master != factoryClone);
    }
}
