package com.production;
import java.util.List;

public class Movie {
    protected String title;
    protected double rating;
    protected Director director;
    protected Writer writer;
    protected LeadActor leadActor;
    protected List<SupportingActor> supportingActors;
    protected double budget;

    public Movie(String title, double rating, Director director, Writer writer, LeadActor leadActor, List<SupportingActor> supportingActors, double budget) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.writer = writer;
        this.leadActor = leadActor;
        this.supportingActors = supportingActors;
        this.budget = budget;
    }

    public void printInfo() {
        System.out.println("Title: " + title + ", Rating: " + rating);
        director.printInfo();
        writer.printInfo();
        leadActor.printInfo();
        for (SupportingActor actor : supportingActors) {
            actor.printInfo();
        }
        System.out.println("Budget: $" + budget);
    }
}

