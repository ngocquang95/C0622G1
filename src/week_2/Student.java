package week_2;

public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public static void main(String[] args) {
        Double d1 =new Double(10.0);
        double d2 = 20.0;
        d1.compareTo(d2);
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
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
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(score, o.score);
    }
}
