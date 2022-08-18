package week_2;

public class Main {
    // Tại sao biến local lại không có giá trị mặc định ,
    // cho dù là kiểu dữ liệu tham chiếu, nguyên thủy
    int a;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.a);

        Person person = new Person() {
            @Override
            public void run() {
                System.out.println("ok");
            }

            public void eat() {
                System.out.println("ok");
            }
        };

        person.eat();
    }
}
