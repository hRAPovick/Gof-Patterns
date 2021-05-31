package com.hrapovick.creational.singleton;

public class Runner {
    public static void main(String[] args) {

        //Убеждаемся, что получаем один и тот же объект

        for (int i = 0; i < 5; i++) {
            System.out.println(ProgramLogger.getProgramLogger());
        }
        System.out.println("\n==================\n");

        ProgramLogger.getProgramLogger().addLogInfo("First log...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
