package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmazingSpiderman extends PeterParker {
    String actor = "앤드류 가필드";
    String[] villains = {"리자드", "일렉트로", "그린 고블린"};
    boolean guilty = true;

    public AmazingSpiderman() {
        super();
        this.name = "Peter Parker";
        this.age = 27;
        this.earth = "Earth-120703";
        this.birth = "2012-07-03";
        this.partner = "Gwen Stacy";
        this.archEnemy = "Doctor Octopus";
    }

    public void createStuff() {
        System.out.println("I can make anything including Web shooter.");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who plays Amazing Spiderman?");
        questions.add("Who are Amazing Spiderman's villains?");
        questions.add("What is Amazing Spiderman's guilt status?");

        List<String> answers = new ArrayList<>();
        answers.add(actor);
        answers.add(String.join(", ", villains));
        answers.add(String.valueOf(guilty));

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Amazing Spiderman. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Amazing Spiderman's Powers:");
        createStuff();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Amazing Spiderman's Arch Enemies: " + String.join(", ", villains));
        System.out.println();
    }
}

