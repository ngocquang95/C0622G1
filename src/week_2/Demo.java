package week_2;

import java.util.*;

public class Demo {
    /*
    C05:
    menu lựa chọn sắp xếp
    1. sắp xếp theo tên
    2. sắp xếp theo điểm

    C06
    sắp xếp theo điểm => Có thể sử dụng cả 2 cách
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Minh Châu", 1));
        students.add(new Student("Mau Hoàng", 0.5));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        });

        Collections.sort(students, Comparator.comparingDouble(Student::getScore));
        System.out.println(students);

        Collections.sort(students, new StudentSortByScore());
        System.out.println(students);

    }
}
