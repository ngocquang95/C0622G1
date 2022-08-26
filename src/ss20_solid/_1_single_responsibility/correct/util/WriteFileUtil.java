package ss20_solid._1_single_responsibility.correct.util;

import ss16_io_text_file.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writeFile(List<Student> students) throws IOException {
        File file = new File("src/ss16_io_text_file/data/student.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student : students) {
            bufferedWriter.write(student.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
