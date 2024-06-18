package kcs.spiderman;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class MusicControl implements Runnable {
    private BlockingQueue<String> musicQueue;
    private boolean isPlaying = true;

    public MusicControl(BlockingQueue<String> musicQueue) {
        this.musicQueue = musicQueue;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (play/pause/next): ");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "play":
                    if (!isPlaying) {
                        isPlaying = true;
                        System.out.println("Music resumed.");
                    } else {
                        System.out.println("Music is already playing.");
                    }
                    break;
                case "pause":
                    if (isPlaying) {
                        isPlaying = false;
                        System.out.println("Music paused.");
                    } else {
                        System.out.println("Music is already paused.");
                    }
                    break;
                case "next":
                    System.out.println("Skipping to next track.");
                    // 현재 트랙을 강제로 넘기기 위해 큐를 비움
                    musicQueue.clear();
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}