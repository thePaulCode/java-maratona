package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

import java.util.Objects;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+ imposto);

        if(produto instanceof Tomate tomate){
            System.out.println("Data de validade: "+tomate.getDataValidade());
        }
    }
//    public static void calcularImpostoComputador(Computador computador){
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto do computador " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println(tomate.getNome());
//        System.out.println("Valor " + tomate.getValor());
//        System.out.println("Imposto do tomate " + imposto);
//    }

}
