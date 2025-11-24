package javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];

        System.out.println("NumberFormat.getInstance() " + NumberFormat.getInstance());

        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(localeBR);
        numberFormat[2] = NumberFormat.getInstance(localeJP);
        numberFormat[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat1 : numberFormat){
            System.out.println(numberFormat1.format(valor));
        }
    }
}
