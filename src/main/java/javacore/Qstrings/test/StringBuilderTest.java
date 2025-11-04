package javacore.Qstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Willian S";
        nome.concat(" DevDojo");
        System.out.println(nome); // Willian S - immutable
        StringBuilder sb = new StringBuilder("Willian S");
        sb.append(" DevDojo");
        sb.reverse();
        System.out.println(sb);
    }
}
