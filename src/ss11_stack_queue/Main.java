package ss11_stack_queue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(Integer.parseInt("30"));

        int total = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            total += arrayList.get(i);
        }

        System.out.println("Tổng: " + total);
    }
}
