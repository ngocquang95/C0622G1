package week_1;

import java.time.LocalDate;

public class Main {
    private class A {
    }

    private A a;

    public static void main(String[] args) {
        // Vẫn chưa biết cách khai báo biến trong Java
        final int HANG_NE = 2;
        int a;
        String target = "123";
        int b = Integer.parseInt(target);
        char c = (char) b;
        String str = b + "";
        String str2 = String.valueOf(b);

//        Anh cho em hỏi là Interger.parseInt
//        bắt buộc là phải luôn có không a.
//        Vì em dùng kiểu int sẵn thì nhất thiết
//        dùng không ạ.

        //demo Ứng dụng của inner class, outer class

        LocalDate localDate = LocalDate.now();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            System.out.println("C0622G1");
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start);
    }
}
