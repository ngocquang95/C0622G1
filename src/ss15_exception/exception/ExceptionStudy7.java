package ss15_exception.exception;

public class ExceptionStudy7 {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Bạn chưa đủ tuổi");
        }
    }
}
