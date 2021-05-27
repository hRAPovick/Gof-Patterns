package com.hrapovick.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Actitity actitity = new Sleeping();
        Developer developer = new Developer();

        developer.setActitity(actitity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            try {
                developer.changeActivity();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
