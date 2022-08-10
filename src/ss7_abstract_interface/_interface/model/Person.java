package ss7_abstract_interface._interface.model;

public interface Person {
    String name = "ABC";

    // public static final int MAX_PERSON = 100;
    int MAX_PERSON = 100;

    // public abstract void test();
    void test();

    //Lớp con có thể hoặc không @Override
    default void test2() {

    }

    //Lớp con không thể  @Override
    static void test3() {

    }
}
