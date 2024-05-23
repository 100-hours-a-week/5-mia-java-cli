package com.production;
import java.util.List;

public class Director extends Person {
    private int experience;
    private List<String> famousMovies;

    public Director(String name, int age, int filmCount, int experience, List<String> famousMovies) {
        super(name, age, "com.production.Director", filmCount);
        this.experience = experience;
        this.famousMovies = famousMovies;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Experience: " + experience + " films");
        System.out.println("Famous Movies: " + famousMovies);
    }
}
