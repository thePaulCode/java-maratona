package Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {

         List<Dog> dogList = List.of(new Dog(), new Dog());
         List<Cat> catList = List.of(new Cat(), new Cat());
         List<Animal> animalList = new ArrayList<>();
         printConsultAnimal(animalList);

    }

    // Type erasure
    private static void printConsulta(List<? extends Animal> animals){
        for (Animal animal : animals)
            animal.consulta();

    }

    private static void printConsultAnimal(List<? super Animal> animals){

        animals.add(new Cat());
        animals.add(new Dog());
        animals.forEach(System.out::println);
    }
}
