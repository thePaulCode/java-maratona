package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // var de referência do objeto Estudante
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Paul";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Tob";
        estudante02.idade = 31;
        estudante02.sexo = 'M';
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("----------------------------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);



    }
}
