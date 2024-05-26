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

    public void savePeople() {
        System.out.println("사람들을 구해야돼!");
    }

    public void patrol() {
        // 순찰한다.
        System.out.println("순찰 도는 건 즐겁다. 강아지를 찾아주고, 소매치기범을 붙잡고, \n애들한테 팬서비스를 하다보면 핫도그도 얻어먹을 수 있는걸. ");
    }

    public void chaseVillain() {
        // 악당을 쫓는다.
        System.out.println("거기서! 이 악당아");
    }

    public void webSwing() {
        System.out.println("슈슉! 거미줄 타고 건물 날아다니기!");
    }

    public void joke() {
        System.out.println("스파이더맨이 저질 농담을 시작했다! 끝이 나지 않는다!");
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
