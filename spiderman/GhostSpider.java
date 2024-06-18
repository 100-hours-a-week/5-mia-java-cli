package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GhostSpider extends Spiderman {
    String friend = "Peter Parker";
    String suitColor = "white&pink";

    public GhostSpider() {
        super("Gwen Stacy", 19, "Earth-65", "2014-09-17", "None", "Kingpin");
    }

    public void playDrum() {
        System.out.println("I play drum. In MJ band.");
    }

    public void travelMultiverse() {
        System.out.println("Let's travel to another Universe.");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who is Ghost Spider's friend?");
        questions.add("What color is Ghost Spider's suit?");

        List<String> answers = new ArrayList<>();
        answers.add(friend);
        answers.add(suitColor);

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Ghost Spider. \nLet's see how much you know about her.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Ghost Spider's Powers:");
        playDrum();
        travelMultiverse();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Ghost Spider's Arch Enemy: " + archEnemy);
        System.out.println();
    }
}
