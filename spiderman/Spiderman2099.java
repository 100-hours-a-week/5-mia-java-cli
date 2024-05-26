package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Spiderman2099 extends Spiderman {
    String assistant = "LYLA";

    public Spiderman2099() {
        super("Miguel O'Hara", 35, "Earth-928", "1992-08-01", "None", "Various");
    }

    public void shootWeb(Object target) {
        System.out.println("Shooting Organic web at " + target);
    }

    public void travelMultiverse() {
        System.out.println("To save peace of multiverse.");
    }

    public void bite() {
        System.out.println("Grow mysterious fangs");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who is Spiderman 2099's assistant?");
        questions.add("What is Spiderman 2099's real name?");
        questions.add("Where is Spiderman 2099 from?");

        List<String> answers = new ArrayList<>();
        answers.add(assistant);
        answers.add("Miguel O'Hara");
        answers.add("Earth-928");

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Spiderman 2099. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Spiderman 2099's Powers:");
        shootWeb("ENEMY!!");
        travelMultiverse();
        bite();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Spiderman 2099's Arch Enemy: " + archEnemy);
        System.out.println();
    }
}
