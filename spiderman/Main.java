package kcs.spiderman;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        Menu.printWelcome();

        // 음악 재생을 위한 큐
        BlockingQueue<String> musicQueue = new LinkedBlockingQueue<>();

        // 음악 플레이 스레드 실행
        Thread musicPlayerThread = new Thread(new MusicPlayerSimulator(musicQueue));
        musicPlayerThread.start();

        // 음악 제어 스레드 실행
        Thread musicControlThread = new Thread(new MusicControl(musicQueue));
        musicControlThread.start();

        // 현재 재생 중인 음악 트랙 정보 표시 스레드 실행
        Thread musicDisplayThread = new Thread(new MusicDisplay(musicQueue));
        musicDisplayThread.start();

        while (!exit) {
            Menu.printMenu();
            System.out.print("User: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Menu.introducePeople(scanner);
                    break;
                case 2:
                    Menu.showSpiderPowers(scanner);
                    break;
                case 3:
                    Menu.trackVillains(scanner);
                    break;
                case 4:
                    Menu.spideyTrivia(scanner);
                    break;
                case 5:
                    Menu.musicControlMenu(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}

