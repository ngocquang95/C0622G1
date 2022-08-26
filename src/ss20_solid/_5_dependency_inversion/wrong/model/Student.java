package ss20_solid._5_dependency_inversion.wrong.model;

public class Student {
    private int id;
    private String name;
    LaptopDell laptopDell;

    public Student(int id, String name, LaptopDell laptopDell) {
        this.id = id;
        this.name = name;
        this.laptopDell = laptopDell;
    }
}
