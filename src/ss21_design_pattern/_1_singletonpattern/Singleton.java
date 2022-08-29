package ss21_design_pattern._1_singletonpattern;

public class Singleton {
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//        System.out.println("Singleton() được gọi");
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton() được gọi");
    }

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
