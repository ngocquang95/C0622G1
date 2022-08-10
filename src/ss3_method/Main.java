package ss3_method;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int a = 2;
//        changeValue(a);
//
//        System.out.println(a);

        int[] a = {1, 2};
        changeValue(a);
        System.out.println(Arrays.toString(a));
    }

    static void changeValue(int[] arr) {
        arr[0] = 100;
        arr = new int[]{10, 20};
        arr[1] = 200;
    }

    static void changeValue(int n) {
        n = 100;
    }
}
