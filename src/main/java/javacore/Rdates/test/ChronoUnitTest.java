package javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1990, Month.FEBRUARY, 21, 10, 30);
        Long difereca = ChronoUnit.DAYS.between(aniversario, LocalDateTime.now());
        System.out.println("Diferença de Tempo entre (1990, Month.FEBRUARY, 21, 10, 30) e agora: "+difereca + " dias.");
        System.out.println("Minha idade em semanas: " + ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println("De hoje ao fim do ano: " + ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.of(2025, Month.DECEMBER, 31, 23, 59)) + " dias.");
    }
}
