package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);

        System.out.println("Phần tử lấy ra: " + integerQueue.element());
        System.out.println("Phần tử lấy ra: " + integerQueue.peek());
        System.out.println("Phần tử lấy ra: " + integerQueue.remove());
        System.out.println("Phần tử lấy ra: " + integerQueue.poll());

    }
}
