package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Ovalo");
        endereco.setCep("090123456");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Carvalho");
        pessoa.setCpf("98765432100");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("--------------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Vilel");
        funcionario.setCpf("30826000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000.0D);

        funcionario.imprime();
    }
}
