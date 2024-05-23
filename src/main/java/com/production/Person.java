package com.production;

public class Person {
    protected String name;
    protected int age;
    protected String role;
    protected int filmCount;

    public Person(String name, int age, String role, int filmCount) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.filmCount = filmCount;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Role: " + role + ", Films: " + filmCount);
    }
}
