package ss15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionStudy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = 0;

        while (true) {
            try {
                System.out.print("Nhập vào điểm của bạn: ");
                // Biểu thức chính quy
                score = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
//                scanner.nextLine();//xóa bộ nhớ đệm hỉ => Không cần vì ở trên đã đọc hết rồi
                System.out.println("Rơi nào khối catch rồi");
            }
        }


        System.out.println("Điểm của bạn là: " + score);
        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
