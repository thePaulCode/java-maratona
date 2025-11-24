package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {

        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];

        System.out.println("NumberFormat.getCurrencyInstance() " + NumberFormat.getCurrencyInstance());

        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat1 : numberFormat){
            System.out.println(numberFormat1.format(valor));
        }

        String valorString = "R$ 1.000,21";
        try {
            System.out.println(numberFormat[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println("------------");
        Locale localeBraz = new Locale("pt", "BR");
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(localeBraz);

        double salario = 14_547.31415D;
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data do pagamento "+dateFormat.format(calendar.getTime()));
        numberFormat1.setMaximumFractionDigits(3);
        System.out.println("Salário formatado "+numberFormat1.format(salario));
        System.out.println(numberFormat1.getMaximumFractionDigits());
    }
}
