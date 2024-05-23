package com.production;
import java.util.List;

public class LeadActor extends Actor {
    private int leading;
    private double sincerity;

    public LeadActor(String name, int age, int filmCount, int reputation, double pay, List<String> awards, int leading, double sincerity) {
        super(name, age, filmCount, reputation, pay, awards);
        this.leading = leading;
        this.sincerity = sincerity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Leading roles: " + leading);
        System.out.println("Sincerity: " + sincerity + "%");
    }
}
