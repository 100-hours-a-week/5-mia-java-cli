package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PeterParker extends Spiderman {
    String[] creator = {"Stan Lee", "Steve Ditko"};
    String wife = "MaryJane";
    String daughter = "Mayday";

    public PeterParker() {
        super("Peter Parker", 25, "Earth-616", "1962-08-15", "Mary Jane Watson", "Green Goblin");
    }

    public void stopSubway() {
        System.out.println("Typical Heroic act - Stop the Subway!!!");
        // 지하철을 멈춘다.
    }

    public void danceBadly() {
        System.out.println("Oh no! Spider-Man has started dancing awkwardly!");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who created Peter Parker?");
        questions.add("Who is Peter Parker's wife?");
        questions.add("Who is Peter Parker's daughter?");

        List<String> answers = new ArrayList<>();
        answers.add(creator[0]);
        answers.add(wife);
        answers.add(daughter);

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Peter Parker. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Are you prepared to see what Peter Parker can do? :)\n");
        stopSubway();
        danceBadly();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Peter Parker's Arch Enemy: " + archEnemy);
        System.out.println();
    }
}
