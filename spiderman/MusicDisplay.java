package kcs.spiderman;

import java.util.concurrent.BlockingQueue;

public class MusicDisplay implements Runnable {
    private BlockingQueue<String> musicQueue;

    public MusicDisplay(BlockingQueue<String> musicQueue) {
        this.musicQueue = musicQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String currentTrack = musicQueue.take(); // 큐에서 현재 트랙 정보 가져옴
                System.out.println("Now playing: " + currentTrack);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
