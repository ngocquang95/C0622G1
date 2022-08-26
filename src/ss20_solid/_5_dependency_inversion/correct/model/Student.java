package ss20_solid._5_dependency_inversion.correct.model;

public class Student {
    private int id;
    private String name;
    Laptop laptop;

    public Student(int id, String name, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.laptop = laptop;
    }
}
