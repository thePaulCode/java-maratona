package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mozart", 35);
        Aluno aluno2 = new Aluno("Beethoven", 50);
        Aluno aluno3 = new Aluno("Mendelson", 85);
        Aluno aluno4 = new Aluno("Bach", 70);
        Aluno[] alunos1 = new Aluno[]{aluno1, aluno2};
        Aluno[] alunos2 = new Aluno[]{aluno3, aluno4};

        Seminario seminario1 = new Seminario("Musik Wienn", "Österreich");
        seminario1.setAlunos(alunos1);
        //seminario1.imprime();

        Seminario seminario2 = new Seminario("Albert Einstein Museum", "Switzerland");
        seminario2.setAlunos(alunos2);
        //seminario2.imprime();

        Seminario[] seminarios = new Seminario[]{seminario1, seminario2};

        Professor professor = new Professor("Haydn", "Klassic Musik");
        professor.setSeminarios(seminarios);
        professor.imprime();

    }
}
