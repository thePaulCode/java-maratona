package javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);

        LocalTime time = LocalTime.now();
        LocalTime timePlusTwoHours = LocalTime.now().plusHours(1);

        Duration duration = Duration.between(localDateTime, nowAfterTwoYears);
        System.out.println("LocalDateTime duration: "+duration);
        System.out.println(duration.dividedBy(8760).toString().split("[A-Z]")[2] + " horas");
        System.out.println("LocalTime duration: "+ Duration.between(time, timePlusTwoHours));


    }
}
