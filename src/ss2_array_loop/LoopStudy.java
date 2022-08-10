package ss2_array_loop;

import java.util.Scanner;

public class LoopStudy {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();
//        int i = 1;
//        while (i <= n) {
//            System.out.print(i + "\t");
//            i++;
//        }

//        int i = 1;
//        while (true) {
//            i++;
//            if (i % 2 == 0) {
//                continue;
//            }
//
//            if (i % 5 == 0) {
//                break;
//            }
//            System.out.print(i + "\t");
//        }

        Scanner scanner = new Scanner(System.in);

        double score;
        boolean isInvalidScore;
        System.out.print("Nhập vào điểm của bạn: ");
        do {
            score = Double.parseDouble(scanner.nextLine());

            isInvalidScore = score < 0 || score > 10;
            if (isInvalidScore) {
                System.out.println("Điểm của bạn nhập vào không hợp lệ [0-10], xin nhập lại");
            }
        } while (isInvalidScore);

        System.out.println("Điểm của bạn là: " + score);
    }
}
