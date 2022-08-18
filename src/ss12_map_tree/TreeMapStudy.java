package ss12_map_tree;

import java.util.*;

public class TreeMapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new TreeMap<>(Collections.reverseOrder());

        stringMap.put(1, "Minh Châu");

        stringMap.put(2, "Mậu Hoàng");
        stringMap.put(3, "Minh Châu 3");
        stringMap.put(-2, "Mậu Hoàng 2");
        stringMap.put(10, "Mậu Hoàng 2");
        stringMap.put(8, "Mậu Hoàng 2");
        stringMap.put(7, "Mậu Hoàng 2");
        stringMap.put(9, "Mậu Hoàng 2");

//        System.out.println(stringMap);
        //Cách 1 => Duyệt theo key
        Set<Integer> integerSet = stringMap.keySet();
        for (Integer item : integerSet) {
            System.out.printf("%s - %s\n", item, stringMap.get(item));
        }
    }
}
