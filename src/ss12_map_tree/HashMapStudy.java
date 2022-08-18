package ss12_map_tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        stringMap.put(1, "Minh Châu");

        stringMap.put(2, "Mậu Hoàng");
        stringMap.put(3, "Minh Châu 3");
        stringMap.put(2, "Mậu Hoàng 2");
        System.out.println(stringMap.get(1));
        System.out.println(stringMap.get(2));
        System.out.println(stringMap.get(3));

//        System.out.println(stringMap);
        //Cách 1 => Duyệt theo key
        Set<Integer> integerSet = stringMap.keySet();
        for (Integer item : integerSet) {
            System.out.printf("%s - %s\n", item, stringMap.get(item));
        }

        //Duyện theo entry
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
    }
}
