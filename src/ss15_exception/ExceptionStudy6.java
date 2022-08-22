package ss15_exception;

import ss15_exception.exception.AgeException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionStudy6 {
    public static void main(String[] args) {
        checkAge(17);
    }

    public static void checkAge(int age){
        if (age < 18) {
            try {
                throw new AgeException("Bạn chưa đủ tuổi");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
