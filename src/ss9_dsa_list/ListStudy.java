package ss9_dsa_list;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ListStudy {
    public static void main(String[] args) {
//        Integer a = 128;
//        Integer b = 128;
//
//        System.out.println(a == b);

//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(10);
//        arrayList.add(10);
//        arrayList.add(10);
//
//        System.out.println(arrayList);

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(60);
        set.add(-60);
        set.add(10);
        set.add(10);

        int a;

        System.out.println(set.toString());
    }
}
