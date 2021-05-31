package com.hrapovick.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();

        DeveloperFactory developerFactory2 = createDeveloperBySpecialty("c++");
        Developer developer2 = developerFactory2.createDeveloper();

        developer2.writeCode();

        DeveloperFactory developerFactory3 = createDeveloperBySpecialty("php");
        Developer developer3 = developerFactory3.createDeveloper();

        developer3.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
