package com.production;
import java.util.List;

public class Actor extends Person {
    protected int reputation;
    protected double pay;
    protected List<String> awards;

    public Actor(String name, int age, int filmCount, int reputation, double pay, List<String> awards) {
        super(name, age, "Actor", filmCount);
        this.reputation = reputation;
        this.pay = pay;
        this.awards = awards;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Reputation: " + reputation);
        System.out.println("Pay: $" + pay);
        System.out.println("Awards: " + awards);
    }
}