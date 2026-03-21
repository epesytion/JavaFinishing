package a_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {
        // How to work with DATES & TIMES using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate localDate = LocalDate.now(); //What day right now?
        System.out.println("Only date rn: " + localDate);

        LocalTime localTime = LocalTime.now(); //What time right now?
        System.out.println("Only time rn: " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now(); //What date and what time rn?
        System.out.println("Date and time rn: " + localDateTime);

        Instant instant = Instant.now();
        System.out.println("UTC:" + instant); //Current date and time in UTC


        // Custom format for our datetime

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Date and time format: " + formattedDateTime);
     /*
     yy - year
     MM - month
     dd - day
     HH - hour
     mm - minutes
     ss - seconds
      */
    }
}
