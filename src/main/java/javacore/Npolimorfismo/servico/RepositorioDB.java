package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioDB implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um DB...");

    }
}
