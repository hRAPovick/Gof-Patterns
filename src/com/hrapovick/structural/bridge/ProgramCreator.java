package com.hrapovick.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {

                new BankSystem(new JavaDeveloper()),
                new StockExchange(new JavaDeveloper()),

                new BankSystem(new CppDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
