package Zgenerics.service;

import java.util.List;

public class RentalService<T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando Objeto disponivel...");
        final T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: " + t);
        System.out.println("Objetos disponiveis para alugar.");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar.");
        System.out.println(objetosDisponiveis);
    }
}
