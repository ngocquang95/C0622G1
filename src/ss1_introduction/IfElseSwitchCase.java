package ss1_introduction;

public class IfElseSwitchCase {
    public static void main(String[] args) {
        /*
        < 5 => Rớt module
        [5: 7) => Khá
        [7: 10] => Giỏi
         */
        double score = 5;

        // Cách thiếu nhi
        if (score < 5 && score >= 0) {
            System.out.println("Rớt module");
        }

        if (score < 7 && score >= 5) {
            System.out.println("Khá");
        }

        if (score <= 10 && score >= 7) {
            System.out.println("Giỏi");
        }

        // Cách người trưởng thành
        if (score < 5 && score >= 0) {
            System.out.println("Rớt module");
        } else if (score < 7 && score >= 5) {
            System.out.println("Khá");
        } else if (score <= 10 && score >= 7) {
            System.out.println("Giỏi");
        }

        // Cách người từng trải
        if (score < 5) {
            System.out.println("Rớt module");
        } else if (score < 7) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }

        /*
        2 => thứ 2
        3 => thứ 3 ,...
         */
        int day = 2;
        switch (day) {
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            default:
                System.out.println("Giá trị sai");
        }


        if (false) {
            System.out.println("line61");
            System.out.println("line61");
        }
        System.out.println("line62");

        int a = 2;
        int b = 2;

        System.out.println(a == b);

    }
}
