package com.hrapovick.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer1 = new JavaDeveloper();
        Developer developer2 = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer3 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        Developer developer4 = new JavaTeamLead(new JavaDeveloper());

        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer3.makeJob());
        System.out.println(developer4.makeJob());
    }
}
