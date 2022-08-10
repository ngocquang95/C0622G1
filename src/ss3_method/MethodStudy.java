package ss3_method;

import java.util.Scanner;

public class MethodStudy {
    public static void main(String[] args) {
//        -	S = c! + c! + c!
        // Bước 1: Nhập c, nhập c, nhập c
        Scanner scanner = new Scanner(System.in);

        int a = inputPositive("a");
        int b = inputPositive("b");
        int c = inputPositive("c");
        // Bước 2: Tính giai thừa của a, b, c

        long factorialA = getFactorialN(a); // đối số

        long factorialB = getFactorialN(b);

        long factorialC = getFactorialN(c);

        long sum = factorialA + factorialB + factorialC;

        System.out.printf("%d! + %d! + %d! = %d", a, b, c, sum);
    }

    private static long getFactorialN(int n) { // tham đối số
        long factorialA = 1;
        for (int i = 2; i <= n; i++) {
            factorialA *= i;
        }
        return factorialA;
    }

    public static int inputPositive(String target) {
        Scanner scanner = new Scanner(System.in);
        int n;
        boolean isInvalidA;
        System.out.printf("Nhập vào số nguyên %s: ", target);
        do {
            n = Integer.parseInt(scanner.nextLine());

            isInvalidA = n < 0;
            if (isInvalidA) {
                System.out.printf("%s phải >= 0, xin hãy nhập lại\n", target);
            }
        } while (isInvalidA);
        return n;
    }
}
