package ru.job4j;

public class Argument {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        Argument.hello(name, age);
        Argument.hello(name, age);
        Argument.hello(name, age);
        Argument.hello(name, age);
    }
}
