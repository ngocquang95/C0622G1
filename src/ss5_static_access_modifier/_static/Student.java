package ss5_static_access_modifier._static;

public class Student {
    private String name;
    private double score;
    static final String className;
    static int count = 0;
    boolean isMale;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ");
        } else {
            this.score = score;
        }
    }

    static {
        className = "C0622G1";
//        int y; => Cục bộ
    }

    public Student(String name, double score) {
//        int x = 2; => Cục bộ
        this.name = name;
        this.score = score;
        count++;
    }

    public void nonStatic() {
        this.name = "ok";
        test();
    }

    public static void test() {
//        this.name = "ok";
//        nonStatic();
    }
}
