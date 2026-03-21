package a_date;

import java.time.LocalDate;
import java.time.LocalTime;

public class dateMethods {
    static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2024, 12, 25);
        LocalDate localDate2 = LocalDate.of(2025, 12, 25);
        LocalDate localDate3 = LocalDate.of(2025, 12, 25);
        if(localDate1.isBefore(localDate2)){
            System.out.println(localDate1 +  " is before " + localDate2);
        }
        if(localDate2.isAfter(localDate1)){
            System.out.println(localDate2 +  " is after " + localDate1);
        }
        if(localDate2.isEqual(localDate3)){
            System.out.println(localDate2 +  " is equals " + localDate3);
        }
    }

}
