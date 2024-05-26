package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MilesMorales extends Spiderman {
    String[] family = {"Jeff", "Rio", "Aaron"};
    String[] movie = {"Into The Spiderverse", "Across The Spiderverse", "Beyond the Spiderverse"};
    String voice = "Shameik Moore";
    String friend = "Ganke Lee";

    public MilesMorales() {
        super("Miles Morales", 17, "Earth-1610", "2011-08-03", "Ganke", "Prowler");
    }

    public void paintWall() {
        System.out.println("He can draw well on the Wall.");
    }

    public void bioElectro(int intensity) {
        for (int i=0; i<intensity; i++){
            System.out.println("Bio Electrokinesis!!!");
        }
    }

    public void camouflage() {
        System.out.println("Ssssh! Being Invisible.");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who is Miles Morales' father?");
        questions.add("Who is Miles Morales' mother?");
        questions.add("Who voices Miles Morales in the movies?");

        List<String> answers = new ArrayList<>();
        answers.add(family[0]);
        answers.add(family[1]);
        answers.add(voice);

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Miles Morales. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Miles Morales' Powers:");
        paintWall();
        bioElectro(1);
        camouflage();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Miles Morales' Arch Enemy: " + archEnemy);
        System.out.println();
    }
}
