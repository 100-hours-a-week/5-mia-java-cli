package kcs.spiderman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MCUspiderman extends PeterParker {
    String actor = "Tom Holland";
    String director = "Jon Watts";
    String address = "Queens, New York";
    String team = "Avengers";
    String friend = "Ned";
    String[] suits = {
            "조악한 홈메이드 수트", "스타크의 소소한 업그레이드 수트", "빨검 수트",
            "빨파 수트", "나이트 몽키 수트", "아이언 스파이더", "전선 수트", "직접 만든 수트"
    };
    /*
    String[] suits = {
    "Homemade suit", "Stark upgraded suit", "Red-black suit",
    "Red-blue suit", "Night Monkey suit", "Iron Spider", "Integrated suit", "Self-made suit"
    };
    */

    String[] villains = {"벌처", "미스테리오", "그린 고블린", "일렉트로", "JJJ"};
    // String[] villains = {"Vulture", "Mysterio", "Green Goblin", "Electro", "JJJ"};

    public MCUspiderman() {
        super();
        this.name = "Peter Parker";
        this.age = 16;
        this.earth = "Earth-199999";
        this.birth = "2016-04-12";
        this.partner = "None";
        this.archEnemy = "Various";
    }

    public void saveMultiverse() {
        System.out.println("I can save Multiverse. But no one remember me...");
    }

    public void visitAvengersTower() {
        System.out.println("Web-swinging! Time to visit Avengers HQ.");
        // System.out.println("웹스윙 시작! 스타크 타워가 보인다. 어벤저스 본부로 놀러가야지.");
    }

    public void peterTingle() {
        System.out.println("Something dangerous is coming.");
    }

    public void vlog() {
        System.out.println("Take a video~");
    }

    @Override
    public void askQuestion(Scanner scanner, Random random) {
        List<String> questions = new ArrayList<>();
        questions.add("Who plays MCU Spiderman?");
        questions.add("Who directed MCU Spiderman?");
        questions.add("Where does MCU Spiderman live?");
        questions.add("Where he belongs to?");
        questions.add("Who's his friend? FYI, it's a man.");

        List<String> answers = new ArrayList<>();
        answers.add(actor);
        answers.add(director);
        answers.add(address);
        answers.add(team);
        answers.add(friend);

        int questionIndex = random.nextInt(questions.size());
        System.out.println("----------------------------------\n");
        System.out.println("Alright, then. You've picked MCU Spiderman. \nLet's see how much you know about him.\n");
        System.out.println(questions.get(questionIndex));
        System.out.println("----------------------------------");
        System.out.print("User: ");
        String userAnswer = scanner.next();
        checkAnswer(userAnswer, answers.get(questionIndex));
    }

    @Override
    public void showPowers() {
        System.out.println("----------------------------------\n");
        System.out.println("MCU Spiderman's Powers:");
        saveMultiverse();
        visitAvengersTower();
        peterTingle();
        vlog();
        System.out.println();
    }

    @Override
    public void showArchEnemy() {
        System.out.println("----------------------------------\n");
        System.out.println("MCU Spiderman's Arch Enemies: " + String.join(", ", villains));
        System.out.println();
    }
}

