package javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main(String[] args) {
        LocalDate now;
        LocalDate dateWithMonthTwo =  LocalDate.now().withMonth(2);
        System.out.println("Data de hoje com mês 02: "+ dateWithMonthTwo);

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next: " + now);

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("Previous: " + now);

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
