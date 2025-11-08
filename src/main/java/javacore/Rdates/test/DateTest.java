package javacore.Rdates.test;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1762259182254L); //long ms desde 1970
        date.setTime(date.getTime() + 3600000L);
        System.out.println(date);
    }
}
