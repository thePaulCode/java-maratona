package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Bill");
        pessoa.setIdade(50);

        pessoa.imprime();
    }
}
