package javacore.Rdates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTimeTokyo = now.atZone(tokyoZone);
        System.out.println(zonedDateTimeTokyo);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        // havaí
        ZoneOffset zoneOffsetHavai = ZoneOffset.of("-10:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffsetHavai);
        System.out.println(" hora e offset : :" + offsetDateTime);

        // Havaí agora
        OffsetDateTime offsetDateTime1 = nowInstant.atOffset(zoneOffsetHavai);
        System.out.println("Hora havaí: "+offsetDateTime1);

    }
}
