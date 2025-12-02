package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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
        String emailPattern = "[\\w-]+@[\\w]+.[a-z]{2,3}$";
//        String regex = "\\d";
//        String regex = "\\D";
//        String regex = "\\s";
//        String regex = "\\S";
//        String regex = "\\w";
        String regex = "\\W";
        String texto = "stll07_-@stern.com3";

        String regexHexa = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String numeroHexa1 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regexHexa);
        Matcher matcher = pattern.matcher(numeroHexa1);
        System.out.println("Texto:    " + numeroHexa1);
        System.out.println("indice: 0123456789 ");
        System.out.println("regex "+emailPattern);
        System.out.println(matcher.find()? "Email válido" : "Email inválido");
        System.out.println("Posicções encontradas");
        while (matcher.find()){
            System.out.print(">>$ "+matcher.start()+ " " + matcher.group() + "\n");
        }
        int numeroHex = 0x59F86A;
        System.out.println(numeroHexa1);
    }
}
