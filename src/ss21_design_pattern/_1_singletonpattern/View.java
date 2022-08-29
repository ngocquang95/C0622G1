package ss21_design_pattern._1_singletonpattern;

public class View {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();
        Singleton singleton6 = Singleton.getInstance();
//        System.out.println(singleton);
    }
}
