package week_1.controller;

import week_1.model.Person;

public class MainController {
    public static void main(String[] args) {
        Person person1 = new Person() {
            @Override
            public void run() {
                System.out.println("oke");
            }
        };

        person1.run();
//
//        Person person2 = new Person() {
//        };
    }
}
