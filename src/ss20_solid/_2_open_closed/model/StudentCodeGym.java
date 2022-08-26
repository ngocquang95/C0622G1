package ss20_solid._2_open_closed.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentCodeGym extends Student {
    public void mangAoCodeGym() {
        //yyyy-MM-dd
        //1999-01-30
        //dd-MM-yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "16/08/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
    }
}
