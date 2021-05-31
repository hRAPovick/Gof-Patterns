package com.hrapovick.creational.abstractFactory.website;

import com.hrapovick.creational.abstractFactory.Developer;

class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
