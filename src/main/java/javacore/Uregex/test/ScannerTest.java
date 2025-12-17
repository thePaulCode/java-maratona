package javacore.Uregex.test;

public class ScannerTest {
    public static void main(String[] args) {
        String texto = "Levi;Erin;Mikasa;true;200";
        String[] nomes = texto.split(";");

        for (String n : nomes){
            System.out.println(n.trim());
        }
    }
}
