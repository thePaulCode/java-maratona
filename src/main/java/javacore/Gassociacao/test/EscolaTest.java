package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Escola escola = new Escola("Barreto");
        Professor professor1 = new Professor("Marco Aurélio");
        Professor professor2 = new Professor("Paulinho");
        Professor professor3 = new Professor("Adriana");
        Professor[] professores = new Professor[]{professor1, professor2, professor3 };
        escola.setProfessores(professores);

        escola.imprime();
    }
}
