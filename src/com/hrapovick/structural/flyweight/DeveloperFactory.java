package com.hrapovick.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * В данном случае фабрика и есть шаблон приспособленец, так как
 * при обращении за объектом отдает каждый раз не новый, а уже созданный.
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java" -> {
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                }
                default -> throw new RuntimeException("Speciality not found...");
            }
        }
        developers.put(speciality, developer);

        return developer;
    }
}
