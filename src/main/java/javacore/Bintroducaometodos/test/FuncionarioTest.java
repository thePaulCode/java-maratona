package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.CalculadoraFuncionario;
import javacore.Bintroducaometodos.dominio.Funcionario;
import javacore.Bintroducaometodos.dominio.ImpressoraFuncionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impressoraFuncionario = new ImpressoraFuncionario();
        CalculadoraFuncionario calculadoraFuncionario = new CalculadoraFuncionario();
        funcionario.nome = "Steve";
        funcionario.idade = 35;
        funcionario.salarios = new double[]{7000.0, 9000.0, 14000.0};

        calculadoraFuncionario.calculaMediaSalario(funcionario);
        impressoraFuncionario.imprime(funcionario);
    }
}
