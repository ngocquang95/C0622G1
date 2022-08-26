package ss17_binary_file.controller;

import java.io.*;

/**
 * Bước 1: Viết vào
 * Bước 2: Đọc
 */
public class BinaryFileStudy {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject("Hoàng Duy");
//        objectOutputStream.writeObject("Minh Châu");
////        objectOutputStream.writeObject(10000);
////        objectOutputStream.writeObject(10000);
////        objectOutputStream.writeObject(10000);
////        objectOutputStream.writeObject(10000);
//
//        objectOutputStream.close();


        //Read
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());


        objectInputStream.close();
    }
}
