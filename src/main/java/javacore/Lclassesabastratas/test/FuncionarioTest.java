package javacore.Lclassesabastratas.test;

import javacore.Lclassesabastratas.dominio.Desenvolvedor;
import javacore.Lclassesabastratas.dominio.Funcionario;
import javacore.Lclassesabastratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
//        Funcionario funcionario = new Funcionario("Musk", 2000.0);
        Gerente gerente = new Gerente("Sharapova", 7000.0);
//        System.out.println(funcionario);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Paul", 10000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
