package javacore.Bintroducaometodos.dominio;

public class CalculadoraFuncionario {

    public void calculaMediaSalario(Funcionario funcionario){
        double soma = 0;
        if( funcionario.getSalarios() == null){
            return;
        }
        for(double salario : funcionario.getSalarios()){
            soma += salario;
        }
        double media = soma / funcionario.getSalarios().length;
        System.out.println("Média salário: R$"+media);
    }
}
