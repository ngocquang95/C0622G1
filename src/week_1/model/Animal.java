package week_1.model;

import week_1.ok.Cat;

public class Animal {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public Animal run(){
        System.out.println("Animal");
        return null;
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
//        animal.sum(1, 2, 3);

        animal.run();
    }
}
