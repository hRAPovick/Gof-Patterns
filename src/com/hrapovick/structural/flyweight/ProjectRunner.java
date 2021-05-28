package com.hrapovick.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
                developers.add(developerFactory.getDeveloperBySpeciality("java"));
                developers.add(developerFactory.getDeveloperBySpeciality("c++"));
        }

        try {
            developers.add(developerFactory.getDeveloperBySpeciality("js"));
        } catch (RuntimeException c) {
            System.out.println();
            System.out.println("======== RuntimeException ======== ");
            System.out.println(c.getMessage());
            System.out.println("======== RuntimeException ======== ");
            System.out.println();
        }

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
