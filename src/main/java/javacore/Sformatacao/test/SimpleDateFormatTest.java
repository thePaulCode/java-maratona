package javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String mascara = "'Londrina,' dd 'de' MMMM 'de' yyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(mascara);
        System.out.println(dateFormat.format(new Date()));
    }
}
