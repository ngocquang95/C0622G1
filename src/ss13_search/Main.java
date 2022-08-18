package ss13_search;

// Đệ Quy
public class Main {
    public static void main(String[] args) {
        String key = "Đạt";
        System.out.println("Nguyễn Minh Đạt".contains(key));
    }

    // Tính giai thừa
    public static long factorial(int n) {
        long temp = 1;
        for (int i = 2; i <= n; i++) {
            temp *= i;
        }

        return temp;
    }

    /*
    n = 4
    factorial2(4) = factorial2(3) * 4 = 6 * 4 = 24
    factorial2(3) = factorial2(2) * 3 = 2 * 3 = 6
    factorial2(2) = factorial2(1) * 2 = 1 * 2 = 2
     */
    public static long factorial2(int n) {
        if (n == 1) {
            return 1;
        }

        return factorial2(n - 1) * n;
    }
}
