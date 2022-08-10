package ss6_inheritance.controller;

import ss6_inheritance.model.Animal;
import ss6_inheritance.model.Cat;

public class MainController {
    public static void main(String[] args) {
        final int COUNT = 2;

        Cat cat = new Cat("Mèo moon", "Trắng");
        // Ngầm định nè
        Animal cat2 = new Animal("Mèo tam thể");
        // Tường minh nè
        Cat catN = (Cat) cat2;
        Cat cat3 = new Cat("Mèo tam thể", "3 màu");
        //compile: Xác định dựa vào class
        //Chỉ cần đáp ứng đủ  Ngầm định  - Tường minh  => Thì không bị lỗi compile

        //runtime: xác định dựa vào từ khóa new
        // ClassCastException => Khi con chuyển thành cha
        System.out.println(cat2 == cat3);
        System.out.println(cat2.equals(cat3));

    }
}
