package ss7_abstract_interface._abstract.controller;

import ss7_abstract_interface._abstract.model.Animal;
import ss7_abstract_interface._abstract.model.Cat;

public class MainController {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.test();
    }
}
