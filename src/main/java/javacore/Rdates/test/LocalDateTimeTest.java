package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        String dia = localDateTime.toString().split("T")[0];
        System.out.println(dia);
        LocalDate date = LocalDate.of(2025, Month.FEBRUARY, 7);
        LocalTime time = LocalTime.of(13, 5, 7);
        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
        System.out.println(localDateTime);
    }
}
