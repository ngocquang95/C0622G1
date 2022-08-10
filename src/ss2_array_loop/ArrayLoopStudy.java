package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopStudy {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        int n;
        boolean isInvalidN;
        System.out.print("Nhập vào số lượng phần tử của mảng: ");
        do {
            n = Integer.parseInt(scanner.nextLine());

            isInvalidN = n < 0;
            if (isInvalidN) {
                System.out.println("Số lượng phần tử của mảng không hợp lệ, xin nhập lại");
            }
        } while (isInvalidN);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int item : arr) {
            System.out.println(item);
        }
        System.out.println(Arrays.toString(arr));

        int[][] arr11 = new int[][]{{1, 2}, {4, 5}, {6, 7}};
        for (int[] item : arr11) {
            System.out.println(Arrays.toString(item));
        }
    }
}
