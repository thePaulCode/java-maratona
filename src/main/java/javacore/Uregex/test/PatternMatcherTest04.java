package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não for dígitos
        // \s = todos espaços em branco
        // \S = todos caracteres excluindo os espaços
        // \w = a-zA-Z0-9_
        // \W = tudo o que não for incluso no w
        // [abc] range de caracteres = encontre ou por a ou por b ou por c
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // () agrupar
        // | o(v|c) ovo | oco
        // $ fim da linha

//        String regex = "\\d";
//        String regex = "\\D";
//        String regex = "\\s";
//        String regex = "\\S";
//        String regex = "\\w";

        String emailPattern = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-z])+)+";
        String texto = "*moi@prs.com; joseph@felix.com; vjoseph17@snts.com";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Posicções encontradas");
        while (matcher.find()){
            System.out.print(">>$ "+matcher.start()+ " " + matcher.group() + "\n");
        }

        System.out.println("Email é válido: " + "*?moi@prs.com".matches(emailPattern) );
        System.out.println("Email é válido: " + "moi@prs.com".matches(emailPattern) );


    }
}
