package com.hrapovick.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database datebase = new AdapterJavaToDB();

        datebase.insert();
        datebase.update();
        datebase.select();
        datebase.remove();
    }
}
