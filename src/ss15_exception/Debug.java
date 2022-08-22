package ss15_exception;

public class Debug {
    public static void main(String[] args) {
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");
        System.out.println("ok");

        for (int i = 0; i < 10; i++) {
            test1(i);
        }
    }

    public static void test1(int n) {
        test2(n);
    }

    public static void test2(int n) {
        System.out.println(n);
    }
}
