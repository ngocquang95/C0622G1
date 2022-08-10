package ss4_class_object;

public class Student {
    String name;
    int age;

    public Student() {
        name = "";
    }

    public Student(String name) {
        this(10);
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showInfo() {
        return this.name + " - " + this.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
