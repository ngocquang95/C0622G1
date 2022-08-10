package ss5_static_access_modifier._static;

public class Animal {
    private boolean isNonStatic;

    private class InnerClass {

    }

    private static boolean isStatic;

    public static class StaticNestedClass {

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.isNonStatic = true;
        InnerClass innerClass = animal.new InnerClass();

        Animal.isStatic = true;
        StaticNestedClass staticNestedClass = new Animal.StaticNestedClass();
    }
}
