package javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate start  = LocalDate.now();
        LocalDate nowAfterThreeYears = LocalDate.now().plusYears(3);
        Period period = Period.between(start, nowAfterThreeYears);
        System.out.println("Period: "+period);

        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofMonths(10);
        Period p3 = Period.ofWeeks(38);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.toString().split("\"[A-Z]\"")[0]);
    }
}
