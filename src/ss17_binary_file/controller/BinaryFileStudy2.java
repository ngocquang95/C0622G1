package ss17_binary_file.controller;

import ss17_binary_file.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Bước 1: Viết vào
 * Bước 2: Đọc
 */
public class BinaryFileStudy2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Hoàng Duy", 2.3));
//        students.add(new Student("Minh Châu", 2.4));

        objectOutputStream.writeObject(new Student("Mậu Hoàng", 100));
//        objectOutputStream.writeObject(10000);
//        objectOutputStream.writeObject(10000);
//        objectOutputStream.writeObject(10000);
//        objectOutputStream.writeObject(10000);
//
        objectOutputStream.close();

        Student.score = 1.2;


        //Read
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        long size = fileInputStream.getChannel().size();
        System.out.println("The file size is " + size + " bytes");

        System.out.println(objectInputStream.readObject());
//        System.out.println(objectInputStream.readObject());

        objectInputStream.close();
    }
}
