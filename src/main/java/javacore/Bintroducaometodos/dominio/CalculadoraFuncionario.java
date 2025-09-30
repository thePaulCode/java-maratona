package javacore.Bintroducaometodos.dominio;

public class CalculadoraFuncionario {

    public void calculaMediaSalario(Funcionario funcionario){
        double soma = 0;
        if( funcionario.salarios == null){
            return;
        }
        for(double salario : funcionario.salarios){
            soma += salario;
        }
        double media = soma / funcionario.salarios.length;
        System.out.println("Média salário: R$"+media);
    }
}
