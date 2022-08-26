package ss19_string_regex;

public class RegexStudy {
    public static void main(String[] args) {
        String regex = "abc";

        System.out.println("abc".equals(regex));
        System.out.println("abc".matches(regex));

        // ====== Dấu ngoặc vuông [...] => Chỉ so sánh với 1 ký tự ======
        regex = "[abc]";
        System.out.println("d".matches(regex));

        // ====== Dấu gạch ngang (-) biểu diễn chuỗi liên tục ======
        regex = "^[a-zA-Z0-9]$";
        System.out.println("0".matches(regex));

        // ====== Dấu mũ (^) Ngoại trừ tập hợp ký tự mẫu khi nằm trong []======
        regex = "[^1-3a-d]";
        System.out.println("a".matches(regex));

        // Tính lặp của tập ký tự mẫu
        // Sử dụng ký tự *: 0 ~ n
        regex = "[ab]*";
        System.out.println("a".matches(regex));

        // + : 1 ~ n
        regex = "[A-Z][0-9]+[A-Z]";
        System.out.println("B123A".matches(regex));

        // Sử dụng ký tự ngoặc nhọn {}
        regex = "[0-9]{3}";
        System.out.println("789".matches(regex));

        regex = "[A-Z][0-9]{3}";
        System.out.println("A789".matches(regex));

        //{n,m} => Từ n~m ký tự
//        regex = "[A-Z][0-9]{7,5}";
//        System.out.println("A789".matches(regex));
//
//        String name = "[A-Z][0-9]{7,5}";
//        System.out.println("A789".matches(name));

        regex = "\\d{2,}";
        System.out.println("5123123".matches(regex));
        regex = "[.]";
        regex = "[+][(]"; // +(84)
        System.out.println("5".matches(regex));
    }
}
