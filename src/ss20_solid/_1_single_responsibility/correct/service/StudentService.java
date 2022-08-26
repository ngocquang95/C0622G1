package ss20_solid._1_single_responsibility.correct.service;

import ss16_io_text_file.model.Student;
import ss20_solid._1_single_responsibility.correct.util.ReadFileUtil;
import ss20_solid._1_single_responsibility.correct.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class StudentService {
    private static void add() throws IOException {
        List<Student> students = ReadFileUtil.readFile();

        // Cho người dùng nhập vào
        students.add(new Student(3, "Trường", 1.5));

        // Write file
        WriteFileUtil.writeFile(students);
    }
}
