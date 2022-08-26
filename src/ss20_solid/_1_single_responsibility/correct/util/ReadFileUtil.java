package ss20_solid._1_single_responsibility.correct.util;

import ss16_io_text_file.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<Student> readFile() throws IOException {
        File file = new File("src/ss16_io_text_file/data/student.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Student> students = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if ("".equals(line)) {
                continue;
            }
            String[] info = line.split(",");
            //1,Minh Châu,2.3
//            int id = Integer.parseInt(info[0]);
//            String name = info[1];
//            double score = Double.parseDouble(info[2]);
//            students.add(new Student(id, name, score));
            Student student = new Student();
            student.setId(Integer.parseInt(info[0]));
            student.setName(info[1]);
            student.setScore(Double.parseDouble(info[2]));
            students.add(student);

            System.out.println(line);
        }

        bufferedReader.close();

        return students;
    }
}
