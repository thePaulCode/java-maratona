package javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());

        int primeiroDiaSemana = calendar.getFirstDayOfWeek();
        System.out.println("Primeiro dia da semana: " + getDiaSemana(primeiroDiaSemana));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        int diaDoAno = calendar.get(Calendar.DAY_OF_YEAR);
        int ultimoDiaAno = 365;
        int horaAgora = calendar.get(Calendar.HOUR);
        System.out.println(horaAgora);
       System.out.printf("Tempo para o fim do ano: %d dias ou %d horas.", (ultimoDiaAno - diaDoAno), (((ultimoDiaAno - diaDoAno)*24) - horaAgora));
    }

    private static String getDiaSemana(int diaSemana ){
        return switch (diaSemana) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Digite um número válido entre 1 e 7";
        };
    }
}
