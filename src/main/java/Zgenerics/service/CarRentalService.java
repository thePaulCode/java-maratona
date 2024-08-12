package Zgenerics.service;

import Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private List<Car> carListAvailabe = new ArrayList<>(List.of(
            new Car("BMW"), new Car("Mercedez")
    ));

    public Car buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        final Car car = carListAvailabe.remove(0);
        System.out.println("Alugando carro: " + car);
        System.out.println("Carros disponiveis para alugar.");
        System.out.println(carListAvailabe);
        return car;
    }

    public void retornarCarroAlugado(Car car){
        System.out.println("Devolvendo carro " + car);
        carListAvailabe.add(car);
        System.out.println("Carros disponiveis para alugar.");
        System.out.println(carListAvailabe);
    }
}
