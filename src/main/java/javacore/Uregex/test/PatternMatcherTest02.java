package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não for dígitos
        // \s = todos espaços em branco
        // \S = todos caracteres excluindo os espaços
        // \w = a-zA-Z0-9_
        // \W = tudo o que não for incluso no w
        String emailPattern = "[\\w-]+@[\\w]+.[a-z]{2,3}$";
//        String regex = "\\d";
//        String regex = "\\D";
//        String regex = "\\s";
//        String regex = "\\S";
//        String regex = "\\w";
        String regex = "\\W";
        String texto = "stll07_-@stern.com3";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:    " + texto);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex "+emailPattern);
        System.out.println(matcher.find()? "Email válido" : "Email inválido");
        System.out.println("Posicções encontradas");
        while (matcher.find()){
            System.out.print(">>$ "+matcher.start()+ " " + matcher.group() + "\n");
        }
    }
}
