package javacore.Sformatacao.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String date1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String date2 = date.format(DateTimeFormatter.ISO_DATE);
        String date3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println("------");
        System.out.println("Parse from String to Object");
        LocalDate parse1 = LocalDate.parse("20251124", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDateTime dateTime1 = LocalDateTime.now();
        String sNow = dateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(sNow);
        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataBR = LocalDate.now().format(dateTimeFormatterBR);
        System.out.println("Data BR" + dataBR);
        System.out.println("Parse");
        LocalDate parseBr = LocalDate.parse("24/11/2025", dateTimeFormatterBR);
        System.out.println(parseBr);

        DateTimeFormatter dateTimeFormatterGE = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String dateGE = LocalDate.now().format(dateTimeFormatterGE);
        System.out.println(dateGE);

        LocalDate parseGE = LocalDate.parse("24.November.2025", dateTimeFormatterGE);
        System.out.println(parseGE);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris"));
        System.out.println(localDateTime);

    }
}
