package ss15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionStudy5 {
    public static void main(String[] args) {
        File file = new File("src/ss15_exception/data/input.txt");

        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        System.out.println("Điểm của bạn là: " + score);
//        System.out.println("Chương trình kết thúc không lỗi lầm");
    }
}
