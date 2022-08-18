package ss12_map_tree;

import ss12_map_tree.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapStudy3 {
    public static void main(String[] args) {
        Map<Student, String> stringMap = new HashMap<>();

        stringMap.put(new Student("Minh Châu", 1.5), "SV001");
        stringMap.put(new Student("Minh Châu", 1.5), "SV002");

        //Cách 1 => Duyệt theo key
        Set<Student> integerSet = stringMap.keySet();
        for (Student item : integerSet) {
            System.out.printf("%s - %s\n", item, stringMap.get(item));
        }

        Student student = new Student("Minh Châu", 1.5);
        Student student2 = new Student("Minh Châu", 1.5);

        System.out.println(student.equals(student2));

    }
}
