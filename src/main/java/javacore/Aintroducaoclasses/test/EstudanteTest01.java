package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // var de referência do objeto Estudante
        Estudante paul = new Estudante();
        paul.nome = "Paul";
        paul.idade = 33;
        paul.sexo = 'M';

        System.out.println("Estudante: " +paul.nome + "\n" +"Idade: " + paul.idade + "\n" +"Sexo: " + paul.sexo);
    }
}
