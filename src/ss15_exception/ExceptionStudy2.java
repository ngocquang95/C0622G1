package ss15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double score = 0;


        while (true) {
            try {
                System.out.print("Nhập vào điểm của bạn: ");
                score = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();//xóa bộ nhớ đệm hỉ
                System.out.println("Rơi nào khối catch rồi");
            }
        }


        System.out.println("Điểm của bạn là: " + score);
        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
