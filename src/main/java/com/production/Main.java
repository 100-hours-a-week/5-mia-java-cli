package com.production;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Director> directors = new ArrayList<>();
    private static List<Writer> writers = new ArrayList<>();
    private static List<Actor> actors = new ArrayList<>();
    private static List<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {
        // Create dummy data
        createDummyData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mia Pictures");
        System.out.println("--------------------------------------------------");
        System.out.println("Explore the crew members and the movies produced by Mia Pictures.");
        System.out.println("Create your own custom movie with our talented team.");
        System.out.println("--------------------------------------------------");

        while (true) {
            System.out.println("What can we assist you with today?");
            System.out.println("1. View Crew Members");
            System.out.println("2. View Produced Movies");
            System.out.println("3. Create Your Own Movie");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------------------");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    showCrewMembers(scanner);
                    break;
                case 2:
                    showMovies(scanner);
                    break;
                case 3:
                    createCustomMovie(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for visiting Mia Pictures. See you at the movies!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createDummyData() {
        // Create dummy data
        Director director1 = new Director("Steven Spielberg", 74, 30, 50, List.of("Jaws", "E.T.", "Jurassic Park"));
        Director director2 = new Director("Christopher Nolan", 50, 20, 10, List.of("Inception", "The Dark Knight"));

        Writer writer1 = new Writer("Aaron Sorkin", 59, 25, 15, List.of("Drama", "Thriller"));
        Writer writer2 = new Writer("Quentin Tarantino", 58, 10, 8, List.of("Crime", "Action"));

        LeadActor leadActor1 = new LeadActor("Leonardo DiCaprio", 46, 30, 90, 20_000_000, List.of("Oscar", "Golden Globe"), 10, 95.0);
        LeadActor leadActor2 = new LeadActor("Tom Hanks", 64, 50, 85, 15_000_000, List.of("Oscar", "Golden Globe"), 20, 90.0);
        SupportingActor supportingActor1 = new SupportingActor("Brad Pitt", 57, 40, 85, 10_000_000, List.of("Oscar"), 80.0);
        SupportingActor supportingActor2 = new SupportingActor("Joseph Gordon-Levitt", 39, 20, 75, 5_000_000, List.of("Golden Globe"), 70.0);

        movies.add(new ActionMovie("Inception", 8.8, director2, writer2, leadActor1, List.of(supportingActor1, supportingActor2), 160_000_000, "Sci-fi Action"));
        movies.add(new ComedyMovie("The Wolf of Wall Street", 8.2, director1, writer1, leadActor2, List.of(supportingActor1), 100_000_000, "Dark Comedy"));

        directors.add(director1);
        directors.add(director2);
        writers.add(writer1);
        writers.add(writer2);
        actors.add(leadActor1);
        actors.add(leadActor2);
        actors.add(supportingActor1);
        actors.add(supportingActor2);
    }

    private static void showCrewMembers(Scanner scanner) {
        System.out.println("==========================================");
        System.out.println("Mia Pictures");
        System.out.println("Creators of exhilarating action films, heartwarming comedies, and edge-of-your-seat thrillers. At Mia Pictures, we bring stories to life with unparalleled passion and creativity.");
        System.out.println("==========================================");
        System.out.println("Directors");
        System.out.println("------------------------------------------");
        for (Director director : directors) {
            System.out.println(director.name);
        }
        System.out.println("==========================================");
        System.out.println("Writers");
        System.out.println("------------------------------------------");
        for (Writer writer : writers) {
            System.out.println(writer.name);
        }
        System.out.println("==========================================");
        System.out.print("Enter the name of the Director or Writer to view more details (or type 'back' to return to the main menu): ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("back")) {
            return;
        }

        boolean found = false;
        for (Director director : directors) {
            if (director.name.equalsIgnoreCase(name)) {
                director.printInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            for (Writer writer : writers) {
                if (writer.name.equalsIgnoreCase(name)) {
                    writer.printInfo();
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No Director or Writer found with that name. Please try again.");
        }
    }

    private static void showMovies(Scanner scanner) {
        System.out.println("==========================================");
        System.out.println("Produced Movies");
        System.out.println("==========================================");
        for (Movie movie : movies) {
            System.out.println(movie.title);
        }
        System.out.println("==========================================");
        System.out.print("Enter the title of the movie to view more details (or type 'back' to return to the main menu): ");
        String title = scanner.nextLine();

        if (title.equalsIgnoreCase("back")) {
            return;
        }

        boolean found = false;
        for (Movie movie : movies) {
            if (movie.title.equalsIgnoreCase(title)) {
                movie.printInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No movie found with that title. Please try again.");
        }
    }

    private static void createCustomMovie(Scanner scanner) {
        System.out.println("==========================================");
        System.out.println("Creating a Custom Movie");
        System.out.println("==========================================");

        Director director = selectDirector(scanner);
        Writer writer = selectWriter(scanner);
        LeadActor leadActor = selectLeadActor(scanner);
        List<SupportingActor> supportingActors = selectSupportingActors(scanner);
        String genre = selectGenre(scanner);
        String subGenre = selectSubGenre(scanner);
        String title = inputTitle(scanner);
        double budget = inputBudget(scanner);

        Movie customMovie = createMovie(genre, title, director, writer, leadActor, supportingActors, budget, subGenre);
        movies.add(customMovie);

        System.out.println("==========================================");
        System.out.println("Custom Movie Created");
        System.out.println("==========================================");
        customMovie.printInfo();
    }

    private static Director selectDirector(Scanner scanner) {
        System.out.println("Select a Director:");
        for (int i = 0; i < directors.size(); i++) {
            System.out.println((i + 1) + ". " + directors.get(i).name);
        }
        System.out.print("Enter the number of the Director: ");
        int directorIndex = scanner.nextInt() - 1;
        scanner.nextLine();  // Consume newline
        return directors.get(directorIndex);
    }

    private static Writer selectWriter(Scanner scanner) {
        System.out.println("Select a Writer:");
        for (int i = 0; i < writers.size(); i++) {
            System.out.println((i + 1) + ". " + writers.get(i).name);
        }
        System.out.print("Enter the number of the Writer: ");
        int writerIndex = scanner.nextInt() - 1;
        scanner.nextLine();  // Consume newline
        return writers.get(writerIndex);
    }

    private static LeadActor selectLeadActor(Scanner scanner) {
        System.out.println("Select a Lead Actor:");
        List<LeadActor> leadActors = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor instanceof LeadActor) {
                leadActors.add((LeadActor) actor);
            }
        }
        for (int i = 0; i < leadActors.size(); i++) {
            System.out.println((i + 1) + ". " + leadActors.get(i).name);
        }
        System.out.print("Enter the number of the Lead Actor: ");
        int leadActorIndex = scanner.nextInt() - 1;
        scanner.nextLine();  // Consume newline
        return leadActors.get(leadActorIndex);
    }

    private static List<SupportingActor> selectSupportingActors(Scanner scanner) {
        System.out.println("Select Supporting Actors (enter numbers separated by spaces):");
        List<SupportingActor> supportingActors = new ArrayList<>();
        for (Actor actor : actors) {
            if (actor instanceof SupportingActor) {
                supportingActors.add((SupportingActor) actor);
            }
        }
        for (int i = 0; i < supportingActors.size(); i++) {
            System.out.println((i + 1) + ". " + supportingActors.get(i).name);
        }
        System.out.print("Enter the numbers of the Supporting Actors: ");
        String[] supportingActorIndexes = scanner.nextLine().split(" ");
        List<SupportingActor> selectedSupportingActors = new ArrayList<>();
        for (String index : supportingActorIndexes) {
            int idx = Integer.parseInt(index) - 1;
            if (idx >= 0 && idx < supportingActors.size()) {
                selectedSupportingActors.add(supportingActors.get(idx));
            }
        }
        return selectedSupportingActors;
    }

    private static String selectGenre(Scanner scanner) {
        System.out.println("Select a Genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Thriller");
        System.out.print("Enter the number of the Genre: ");
        int genreChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (genreChoice) {
            case 1:
                return "Action";
            case 2:
                return "Comedy";
            case 3:
                return "Thriller";
            default:
                System.out.println("Invalid choice. Defaulting to Action.");
                return "Action";
        }
    }

    private static String selectSubGenre(Scanner scanner) {
        System.out.print("Enter the Sub-Genre: ");
        return scanner.nextLine();
    }

    private static String inputTitle(Scanner scanner) {
        System.out.print("Enter the Title of the Movie: ");
        return scanner.nextLine();
    }

    private static double inputBudget(Scanner scanner) {
        System.out.print("Enter the Budget of the Movie: ");
        return scanner.nextDouble();
    }

    private static Movie createMovie(String genre, String title, Director director, Writer writer, LeadActor leadActor, List<SupportingActor> supportingActors, double budget, String subGenre) {
        switch (genre) {
            case "Action":
                return new ActionMovie(title, 0.0, director, writer, leadActor, supportingActors, budget, subGenre);
            case "Comedy":
                return new ComedyMovie(title, 0.0, director, writer, leadActor, supportingActors, budget, subGenre);
            case "Thriller":
                return new ThrillerMovie(title, 0.0, director, writer, leadActor, supportingActors, budget, subGenre);
            default:
                return null;
        }
    }
}
