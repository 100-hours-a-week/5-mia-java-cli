package com.production;
import java.util.List;

public class Writer extends Person {
    private int scripts;
    private List<String> genres;

    public Writer(String name, int age, int filmCount, int scripts, List<String> genres) {
        super(name, age, "Writer", filmCount);
        this.scripts = scripts;
        this.genres = genres;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Scripts: " + scripts);
        System.out.println("Genres: " + genres);
    }
}