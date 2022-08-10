package ss3_method;

public class MethodStudy2 {
    public static void main(String[] args) {
        // Số nguyên t)
        if (isPrime3(5)) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không phải là số nguyên tố");
        }

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int countPrime = 0;
        for (int item : arr) {
            if (isPrime3(item)) {
                countPrime++;
            }
        }
    }

    // Cách thiếu nhi
    public void isPrime(int n) {
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("Không phải số nguyên tố");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Là số nguyên tố");
            }
        }
    }

    // Cách của người trưởng thành
    public void isPrime2(int n) {
        if (n < 2) {
            System.out.println("Không phải là số nguyên tố");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Không phải số nguyên tố");
                return;
            }
        }
        System.out.println("Là số nguyên tố");

    }

    // Cách của người từng trải
    public static boolean isPrime3(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
