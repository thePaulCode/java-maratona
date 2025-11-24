package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoC : isoCountries){
            System.out.print(isoC + " ");
        }

        for(String isoL : isoLanguages){
            System.out.print(isoL + " ");
        }
    }
}
