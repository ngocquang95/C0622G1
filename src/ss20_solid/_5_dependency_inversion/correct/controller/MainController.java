package ss20_solid._5_dependency_inversion.correct.controller;

import ss20_solid._5_dependency_inversion.correct.model.LaptopDell;
import ss20_solid._5_dependency_inversion.correct.model.LaptopMacbook;
import ss20_solid._5_dependency_inversion.correct.model.Student;

public class MainController {
    public static void main(String[] args) {
        Student student = new Student(1, "Mậu Hoàng", new LaptopDell());
        Student student2 = new Student(1, "Mậu Hoàng", new LaptopMacbook());
    }
}
