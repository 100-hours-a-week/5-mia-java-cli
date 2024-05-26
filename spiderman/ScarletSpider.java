package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ScarletSpider extends PeterParker {
    String[] otherNames = {"Chasm", "Jackal"};

    public ScarletSpider() {
        super();
        this.name = "Ben Reilly";
        this.age = 25;
        this.earth = "Earth-616";
        this.birth = "1994-11-01";
        this.partner = "None";
        this.archEnemy = "Various";
    }

    public void seekRevenge() {
        System.out.println("Seek Blood... Seek Revenge. To whom make me like this.");
    }

    public void replace() {
        System.out.println("I should replace Peter.");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("What are Scarlet Spider's other names?");
        questions.add("Who created Scarlet Spider?");
        questions.add("What is Scarlet Spider's main goal?");

        List<String> answers = new ArrayList<>();
        answers.add(String.join(", ", otherNames));
        answers.add("Ben Reilly");
        answers.add("Revenge");

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked Scarlet Spider. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("Scarlet Spider's Powers:");
        seekRevenge();
        replace();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("Scarlet Spider's Arch Enemy: " + archEnemy);
        System.out.println();
    }
}
