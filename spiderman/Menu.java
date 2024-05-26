package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static PeterParker peterParker = new PeterParker();
    private static MilesMorales milesMorales = new MilesMorales();
    private static GhostSpider ghostSpider = new GhostSpider();
    private static Spiderman2099 spiderman2099 = new Spiderman2099();
    private static ScarletSpider scarletSpider = new ScarletSpider();
    private static AmazingSpiderman amazingSpiderman = new AmazingSpiderman();
    private static MCUspiderman mcuSpiderman = new MCUspiderman();

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

    public static void printInvalidOption() {
        System.out.println("Invalid option. Please try again.");
    }


    /* 메소드를 만들어봅시다 */
    public static void introducePeople() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------\n");
        System.out.println("Meet the Spiderpeople!");
        System.out.println("Which Spider-whatever, do you want?\n");
        System.out.println("1. Peter Parker");
        System.out.println("2. Miles Morales");
        System.out.println("3. Ghost Spider");
        System.out.println("4. Spiderman 2099");
        System.out.println("5. Scarlet Spider");
        System.out.println("6. Amazing Spiderman");
        System.out.println("7. MCU Spiderman\n");
        System.out.println("Enter your pick (Just Number)");
        System.out.println("----------------------------------");
        System.out.print("User: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayDetails(peterParker);
                break;
            case 2:
                displayDetails(milesMorales);
                break;
            case 3:
                displayDetails(ghostSpider);
                break;
            case 4:
                displayDetails(spiderman2099);
                break;
            case 5:
                displayDetails(scarletSpider);
                break;
            case 6:
                displayDetails(amazingSpiderman);
                break;
            case 7:
                displayDetails(mcuSpiderman);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
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

    public static void showSpiderPowers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------\n");
        System.out.println("Wanna see what spiders can do?");
        System.out.println("Pick one spider, just type number.\n");
        System.out.println("1. Peter Parker");
        System.out.println("2. Miles Morales");
        System.out.println("3. Ghost Spider");
        System.out.println("4. Spiderman 2099");
        System.out.println("5. Scarlet Spider");
        System.out.println("6. Amazing Spiderman");
        System.out.println("7. MCU Spiderman\n");
        System.out.println("----------------------------------");
        System.out.print("User: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                peterParker.showPowers();
                break;
            case 2:
                milesMorales.showPowers();
                break;
            case 3:
                ghostSpider.showPowers();
                break;
            case 4:
                spiderman2099.showPowers();
                break;
            case 5:
                scarletSpider.showPowers();
                break;
            case 6:
                amazingSpiderman.showPowers();
                break;
            case 7:
                mcuSpiderman.showPowers();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public static void trackVillains() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------\n");
        System.out.println("Villain Tracker");
        System.out.println("Pick one spider, just type number.\n");
        System.out.println("1. Peter Parker");
        System.out.println("2. Miles Morales");
        System.out.println("3. Ghost Spider");
        System.out.println("4. Spiderman 2099");
        System.out.println("5. Scarlet Spider");
        System.out.println("6. Amazing Spiderman");
        System.out.println("7. MCU Spiderman\n");
        System.out.println("----------------------------------");
        System.out.print("User: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                peterParker.showArchEnemy();
                break;
            case 2:
                milesMorales.showArchEnemy();
                break;
            case 3:
                ghostSpider.showArchEnemy();
                break;
            case 4:
                spiderman2099.showArchEnemy();
                break;
            case 5:
                scarletSpider.showArchEnemy();
                break;
            case 6:
                amazingSpiderman.showArchEnemy();
                break;
            case 7:
                mcuSpiderman.showArchEnemy();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public static void spideyTrivia() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuePlaying = true;

        System.out.println("----------------------------------\n");
        System.out.println("Welcome to Spider-Trivia!");
        System.out.println("Which Spider-whatever, do you want to play?\n");
        System.out.println("1. Peter Parker");
        System.out.println("2. Miles Morales");
        System.out.println("3. Ghost Spider");
        System.out.println("4. Spiderman 2099");
        System.out.println("5. Scarlet Spider");
        System.out.println("6. Amazing Spiderman");
        System.out.println("7. MCU Spiderman\n");
        System.out.println("Enter your pick (Just Number)");
        System.out.println("----------------------------------");
        System.out.print("User: ");
        int choice = scanner.nextInt();

        while (continuePlaying) {
            switch (choice) {
                case 1:
                    peterParker.askQuestion(scanner, random);
                    break;
                case 2:
                    milesMorales.askQuestion(scanner, random);
                    break;
                case 3:
                    ghostSpider.askQuestion(scanner, random);
                    break;
                case 4:
                    spiderman2099.askQuestion(scanner, random);
                    break;
                case 5:
                    scarletSpider.askQuestion(scanner, random);
                    break;
                case 6:
                    amazingSpiderman.askQuestion(scanner, random);
                    break;
                case 7:
                    mcuSpiderman.askQuestion(scanner, random);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    return;
            }

            System.out.println("Do you want to try another question? (y/n)");
            System.out.print("User: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("n")) {
                continuePlaying = false;
            }
        }
    }

}
