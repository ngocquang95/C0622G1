package ss11_stack_queue;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        arrayList.add(new ArrayList<>());
        arrayList.add(new ArrayList<>());


        for (ArrayList<Integer> item : arrayList) {
            System.out.println(item);
        }
    }
}
