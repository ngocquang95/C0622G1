package ss11_stack_queue;

import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

//        integerStack.push(10);
//        integerStack.push(20);
//        integerStack.push(30);
//
//        while (!integerStack.isEmpty()) {
//            System.out.println("Phần tử được lấy ra: " + integerStack.pop());
//        }
//
//        System.out.println(integerStack);

        // Chuyển số thập phân sang nhị phân
        int n = 123456789;

        while (n != 0) {
            integerStack.push(n % 2);
            n /= 2;
        }

        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }

        System.out.println("111010110111100110100010101".equals("111010110111100110100010101"));
    }
}
