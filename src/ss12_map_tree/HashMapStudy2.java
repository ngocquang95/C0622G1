package ss12_map_tree;

import ss12_map_tree.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy2 {
    public static void main(String[] args) {
        Map<String, Student> stringMap = new HashMap<>();

        stringMap.put("SV001", new Student("Minh Châu", 1.5));
        stringMap.put("SV002", new Student("Mậu Hoàng", 1));

        //Cách 1 => Duyệt theo key
        Set<String> integerSet = stringMap.keySet();
        for (String item : integerSet) {
            System.out.printf("%s - %s\n", item, stringMap.get(item));
        }
    }
}
