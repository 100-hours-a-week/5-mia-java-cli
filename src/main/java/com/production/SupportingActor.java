package com.production;
import java.util.List;

public class SupportingActor extends Actor {
    private double appeal;

    public SupportingActor(String name, int age, int filmCount, int reputation, double pay, List<String> awards, double appeal) {
        super(name, age, filmCount, reputation, pay, awards);
        this.appeal = appeal;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Appeal: " + appeal);
    }
}

