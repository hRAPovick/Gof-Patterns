package com.hrapovick.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is a log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            System.out.println("Create Singleton");
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
