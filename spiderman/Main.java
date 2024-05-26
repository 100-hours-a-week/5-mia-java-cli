package kcs.spiderman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        Menu.printWelcome();

        while (!exit) {
            Menu.printMenu();
            System.out.print("User: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Menu.introducePeople();
                    break;
                case 2:
                    Menu.showSpiderPowers();
                    break;
                case 3:
                    Menu.trackVillains();
                    break;
                case 4:
                    Menu.spideyTrivia();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    Menu.printInvalidOption();
            }
        }
        sc.close();


    }
}

