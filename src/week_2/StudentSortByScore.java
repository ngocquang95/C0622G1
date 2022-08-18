package week_2;

import java.util.Comparator;

public class StudentSortByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getScore(), o2.getScore());
    }
}
