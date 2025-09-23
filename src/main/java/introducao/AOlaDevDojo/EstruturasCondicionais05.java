package introducao.AOlaDevDojo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;

public class EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        String DOMINGO = "Domingo";
        String SEGUNDA = "SEGUNDA";
        String TERCA = "TERCA";
        String QUARTA = "QUARTA";
        String QUINTA = "QUINTA";
        String SEXTA = "SEXTA";
        String SABADO = "SÁBADO";
        String saida;
        System.out.println("Digite um número de 1 a 7: \n::");
        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();
//        switch (dia){
//            case "1" : saida = DOMINGO;
//            break;
//            case "2" : saida = SEGUNDA;
//            break;
//            case "3" : saida = TERCA;
//            break;
//            case "4" : saida = QUARTA;
//            break;
//            case "5" : saida = QUINTA;
//            break;
//            case "6" : saida = SEXTA;
//            break;
//            case "7" : saida = SABADO;
//            break;
//            default: saida = "Opção inválida.";
//            break;
//        }
//        if(!saida.isEmpty()){
//            System.out.println("Dia da semana é " + saida);
//        } else {
//            System.out.println("Digite um número de 1 a 7");
//        }

        // DADO OS VALORES DE 1 A 7, IMPRIMA SE É DIA ÚTIL OU FINAL DE SEMANA
        switch (dia) {
            case "2", "3", "4", "5", "6":
                saida = "Dia útil.";
                break;
            case "1", "7":
                saida = "Final de semana.";
                break;
            default:
                saida = "Opção inválida";
        }
        System.out.println(saida);
    }
}
