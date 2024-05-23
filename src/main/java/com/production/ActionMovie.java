package com.production;
import java.util.List;

public class ActionMovie extends Movie {
    private String subGenre;

    public ActionMovie(String title, double rating, Director director, Writer writer, LeadActor leadActor, List<SupportingActor> supportingActors, double budget, String subGenre) {
        super(title, rating, director, writer, leadActor, supportingActors, budget);
        this.subGenre = subGenre;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sub-genre: " + subGenre);
    }
}

