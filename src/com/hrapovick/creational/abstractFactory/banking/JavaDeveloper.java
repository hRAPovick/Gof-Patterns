package com.hrapovick.creational.abstractFactory.banking;

import com.hrapovick.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
