package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        //
        String emailPattern = "[a-zA-z0-9._]+@";
        String regex = "ab";
        String texto = "abacateabacate";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:    " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex "+regex);
        System.out.println("Posicções encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
