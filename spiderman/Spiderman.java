package kcs.spiderman;
import java.util.Random;
import java.util.Scanner;

public abstract class Spiderman {
    String name;
    int age;
    String earth;
    String birth;
    String partner;
    String archEnemy;

    public Spiderman(String name, int age, String earth, String birth, String partner, String archEnemy) {
        this.name = name;
        this.age = age;
        this.earth = earth;
        this.birth = birth;
        this.partner = partner;
        this.archEnemy = archEnemy;
    }

    public abstract void askQuestion(Scanner scanner, Random random);

    public abstract void showPowers();

    public abstract void showArchEnemy();

    protected void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Oh, impressive! You really know your spiders.");
        } else {
            System.out.println("Nah! You know less about spiders than the Green Goblin.");
        }
    }

}
