package ss15_exception;

import java.util.Scanner;

public class ExceptionStudy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = 0;

        while (true) {
            try {
                System.out.print("Nhập vào điểm của bạn: ");
                // Biểu thức chính quy
                score = Double.parseDouble(scanner.nextLine());
                int x = 1 / 0;
                System.exit(0);
            } catch (NumberFormatException e) {
//                scanner.nextLine();//xóa bộ nhớ đệm hỉ => Không cần vì ở trên đã đọc hết rồi
                System.out.println("Rơi nào khối catch rồi");
            } catch (ArithmeticException e) {
                System.out.println("Không được chia cho 0");
            }
            catch (Exception e) {
                System.out.println("Lỗi gì đó");
            } finally {
                System.out.println("Rơi vào khối finally");
            }
        }


//        System.out.println("Điểm của bạn là: " + score);
//        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
