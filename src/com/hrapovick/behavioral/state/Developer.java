package com.hrapovick.behavioral.state;

public class Developer {
    Actitity actitity;

    public void setActitity(Actitity actitity) {
        this.actitity = actitity;
    }

    public void changeActivity() throws InterruptedException {
        if (actitity instanceof Sleeping) {
            Thread.sleep(500);
            setActitity(new Training());
        } else if (actitity instanceof Training) {
            Thread.sleep(500);
            setActitity(new Coding());
        } else if (actitity instanceof Coding) {
            Thread.sleep(500);
            setActitity(new Reading());
        } else if (actitity instanceof Reading) {
            Thread.sleep(500);
            setActitity(new Sleeping());
        }
    }

    public void justDoIt() {
        actitity.justDoIt();
    }
}
