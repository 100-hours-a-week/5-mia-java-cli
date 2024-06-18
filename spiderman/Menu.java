package kcs.spiderman;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Spiderman[] spiderPeople = {
            new PeterParker(),
            new MilesMorales(),
            new GhostSpider(),
            new Spiderman2099(),
            new ScarletSpider(),
            new AmazingSpiderman(),
            new MCUspiderman()
    };

    public static void printWelcome() {
        System.out.println("┌-----------------------------------┐");
        System.out.println("│        Into The Spiderverse       │");
        System.out.println("│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⡰⠞⠀⠀⠀⠀⠀⠀⠀   │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⢠⢊⠎⠀⠀⠀⠀⠀⠀⠀⠀   ⠀│\n" +
                           "│⠀⠀⠀⠀⠀⠀⠘⠓⠒⠯⣁⢢⡀⠀⠀⠀⡆⡎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  │\n" +
                           "│⠀⠀⠀⡀⠄⢀⡀⠀⠀⠀⠀⠙⢌⢂⠀⢸⢠⠃⣀⠄⠒⠒⠢⡄⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠘⠉⠁⠚⠦⢍⡒⠀⡀⠀⠈⡄⠇⡇⣼⠞⠁⠀⠀⠀⠀⡸⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠉⠒⢄⡁⢄⢸⢒⣇⡇⠀⠀⠀⠀⠀⡴⠁⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⡀⠤⠄⡸⠥⠋⠀⠀⠐⢀⣀⣀⢤⠎⠒⣒⣒⣀⣲⡠⢀⠀ │\n" +
                           "│⠀⠀⣀⡤⠐⣊⡥⠜⠒⠒⢒⣳⢡⡀⠀⠀⠀⡼⡾⠖⣈⣉⡉⠀⠀⠀⠀⠉⠑⠳ │\n" +
                           "│⢠⡪⠔⠊⠁⠀⠀⠀⠀⣰⠗⠹⣌⢤⣦⡠⢺⣝⢏⠒⠓⠠⠴⢅⣂⣄⠀⠀⠀⠀ │\n" +
                           "│⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⢀⢨⡻⠃⠹⡀⢊⣦⢗⠀⠀⠀⠀⠘⢮⡆⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⣹⢹⢻⢨⠀⠀⠀⠀⠀⠘⠃⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⢲⠘⣆⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣸⢀⣇⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢸⠘⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ │\n" +
                           "│⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ │");
        System.out.println("│    ♪ Spider-Man, Spider-Man ♪     │\n" +
                           "│  ♪ Does whatever a spider can ♪   │\n" +
                           "│    ♪ Spins a web, any size ♪      │");
        System.out.println("└-----------------------------------┘\n");

        System.out.println("Welcome to the Spider-Verse!\n");
    }

    public static void printMenu() {
        System.out.println("==================================\n");
        System.out.println("What do you wanna do?");
        System.out.println("Pick an option:\n");
        System.out.println("1. Meet the Spider-society🕷️");
        System.out.println("2. What powers do these Spidey-folks have?");
        System.out.println("3. Villain Tracker");
        System.out.println("4. Spidey Trivia");
        System.out.println("5. Exit\n");
        System.out.println("----------------------------------");
    }

    private static Spiderman chooseSpiderman(Scanner scanner) {
        System.out.println("Which Spider-whatever, do you want?\n");
        for (int i = 0; i < spiderPeople.length; i++) {
            System.out.println((i + 1) + ". " + spiderPeople[i].name);
        }
        System.out.println("Enter your pick (Just Number)");
        System.out.println("----------------------------------");
        System.out.print("User: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= spiderPeople.length) {
            return spiderPeople[choice - 1];
        } else {
            System.out.println("Invalid option. Please try again.");
            return null;
        }
    }

    public static void introducePeople(Scanner scanner) {
        System.out.println("----------------------------------\n");
        Spiderman chosenSpiderman = chooseSpiderman(scanner);
        if (chosenSpiderman != null) {
            displayDetails(chosenSpiderman);
        }
    }

    private static void displayDetails(Spiderman spiderman) {
        System.out.println("----------------------------------\n");
        System.out.println(spiderman.name);
        System.out.println("name: " + spiderman.name);
        System.out.println("age: " + spiderman.age);
        System.out.println("earth: " + spiderman.earth);
        System.out.println("birth: " + spiderman.birth);
        System.out.println("partner: " + spiderman.partner);
        System.out.println();
    }

    public static void showSpiderPowers(Scanner scanner) {
        Spiderman chosenSpiderman = chooseSpiderman(scanner);
        if (chosenSpiderman != null) {
            chosenSpiderman.showPowers();
        }
    }

    public static void trackVillains(Scanner scanner) {
        Spiderman chosenSpiderman = chooseSpiderman(scanner);
        if (chosenSpiderman != null) {
            chosenSpiderman.showArchEnemy();
        }
    }

    public static void spideyTrivia(Scanner scanner) {
        Random random = new Random();
        boolean continuePlaying = true;
        Spiderman chosenSpiderman = chooseSpiderman(scanner);

        if (chosenSpiderman == null) return;

        System.out.println("----------------------------------\n");
        System.out.println("Welcome to Spider-Trivia!");

        while (continuePlaying) {
            chosenSpiderman.askQuestion(scanner, random);
            System.out.println("Do you want to try another question? (y/n)");
            System.out.print("User: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                continuePlaying = false;
            }
        }
    }
    public static void musicControlMenu(Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            System.out.println("----------------------------------\n");
            System.out.println("Music Control Menu");
            System.out.println("1. Play Music");
            System.out.println("2. Pause Music");
            System.out.println("3. Next Track");
            System.out.println("4. Current Track");
            System.out.println("5. Back to Main Menu");
            System.out.println("----------------------------------");
            System.out.print("User: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Music resumed.");
                    break;
                case 2:
                    System.out.println("Music paused.");
                    break;
                case 3:
                    System.out.println("Skipping to next track.");
                    break;
                case 4:
                    System.out.println("Displaying current track.");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
