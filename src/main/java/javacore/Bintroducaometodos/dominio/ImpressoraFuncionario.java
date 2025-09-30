package javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario){
        System.out.print("Nome: "+funcionario.nome+ " - ");
        System.out.print("Idade: "+funcionario.idade+ " - ");
        System.out.print("Salários: ");
        if(funcionario.salarios !=null){
            for(double salario : funcionario.salarios){
                System.out.print("R$"+salario+ " - ");
            }
        }
    }
}
