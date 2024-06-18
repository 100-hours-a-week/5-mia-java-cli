package kcs.spiderman;

import java.util.concurrent.BlockingQueue;

public class MusicPlayerSimulator implements Runnable {
    private String[] playlist = {
            "What’s Up Danger", "Sunflower", "Way Up", "Familia", "Invincible",
            "Start a Riot", "Hide", "Memories", "Save the Day", "Let go",
            "Scared of the Dark", "Elevate", "Home"
    };
    private int currentTrackIndex = 0;
    private BlockingQueue<String> musicQueue;

    public MusicPlayerSimulator(BlockingQueue<String> musicQueue) {
        this.musicQueue = musicQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String currentTrack = playlist[currentTrackIndex];
                System.out.println("Now playing: " + currentTrack);
                musicQueue.put(currentTrack); // 현재 트랙을 큐에 추가
                Thread.sleep(180000); // 3분 동안 트랙 재생

                currentTrackIndex = (currentTrackIndex + 1) % playlist.length;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}