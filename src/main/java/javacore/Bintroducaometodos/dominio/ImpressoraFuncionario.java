package javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario){
        System.out.print("Nome: "+funcionario.getNome()+ " - ");
        System.out.print("Idade: "+funcionario.getIdade()+ " - ");
        System.out.print("Salários: ");
        if(funcionario.getSalarios() !=null){
            for(double salario : funcionario.getSalarios()){
                System.out.print("R$"+salario+ " - ");
            }
        }
    }
}
