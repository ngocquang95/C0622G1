package ss4_class_object;

import java.util.Scanner;

/**
 * sfsf
 * sdf
 *
 */
public class Main {
    /**
     * Phương thức main để chạy chương trình
     * @param args
     */
    public static void main(String[] args) {
//        Student student = new Student("Sáng", 10);
//        Student student2 = new Student();
//        Student student3 = new Student("Nguyễn Văn A");
//
//        System.out.println("name: " + student3.name);
//        System.out.println("age: " + student3.age);

        Scanner scanner = new Scanner(System.in);

//
//        System.out.print("Nhập vào tên");
//        String name1 = scanner.next();
//        String name2 = scanner.next();
////
//        System.out.println("name: " + name1);
//        System.out.println("name: " + name2);


        // Tạo ra một mảng Student
//        int[] arr = new int[2]; // arr[0] = 0
        Student[] students = new Student[2];
        //student[0] = null

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); // Nhớ new đối tượng hỉ
            System.out.printf("Nhập vào thông tin sinh viên thứ %d\n", i + 1);

            System.out.print("Nhập vào tên: ");
            students[i].name = scanner.nextLine();

            System.out.println("Nhập vào tuổi: ");
            students[i].age = Integer.parseInt(scanner.nextLine());

        }

//        for (int i = 0; i < students.length; i++) {
//            System.out.printf("Thông tin sinh viên thứ %d\n", i + 1);
//            System.out.print("Tên: " + students[i].name);
//            System.out.println("Tuổi: " +  students[i].age);
//        }

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].showInfo());
//        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
//            System.out.println(students[i].toString());
        }
    }
}
