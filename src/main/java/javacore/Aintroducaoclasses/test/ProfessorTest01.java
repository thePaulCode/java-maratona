package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kami";
        professor.idade = 69;
        professor.sexo = 'M';
        System.out.print("Nome: "+ professor.nome + ", Idade: "+ professor.idade +", Sexo: "+ professor.sexo);
    }
}
