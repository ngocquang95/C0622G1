package ss1_introduction;

import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) {
        //System.in là một tiêu chuẩn để nhận dữ liệu từ bạn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào điểm của bạn: ");
        double score = scanner.nextDouble();
//        double score = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập vào tên của bạn: ");
//        scanner.nextLine(); // Xóa bộ nhớ đệm
        String name = scanner.nextLine();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("ĐIểm của bạn là: " + score);
    }
}
