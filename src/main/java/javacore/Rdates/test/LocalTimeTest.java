package javacore.Rdates.test;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime time = LocalTime.of(13,05,00);
        System.out.println(localTime);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
