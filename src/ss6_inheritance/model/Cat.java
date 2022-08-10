package ss6_inheritance.model;

import java.util.Objects;


public class Cat extends Animal {
    private String color;

    // has a
    private Animal animal;

//    @Override
//    public void test() {
//
//    }

    //    public Cat(String color, String name) {
////        super(name);
//        super(name);
////        super.setName(name);
////        super.name = name;
//        this.color = color;
//    }
    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.getName(), this.color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color.equals(cat.color) && super.getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
