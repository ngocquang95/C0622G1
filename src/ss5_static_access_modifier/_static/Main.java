package ss5_static_access_modifier._static;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Trường", 2.0);
        student.setScore(-1); // ĐIểm sai nên không cập nhật
        Student student2 = new Student("Tiến", 1.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp: ");
//        Student.className = scanner.nextLine();
//        Math.PI

        System.out.println("Thông tin sv 1");
        System.out.println("Tên: " + student.getName());
        System.out.println("Điểm: " + student.getScore());
        System.out.println("Tên lớp: " + Student.className);

        System.out.println("Thông tin sv 2");
        System.out.println("Tên: " + student2.getName());
        System.out.println("Điểm: " + student2.getScore());
        System.out.println("Tên lớp: " + Student.className);

        System.out.println("Số lượng thành viên: " + Student.count);
    }
}
