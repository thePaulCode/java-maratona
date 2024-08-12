package Zgenerics.domain;

import Zgenerics.service.CarRentalService;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenergicTest03 {
    public static void main(String[] args) {
        List<Car> carListAvailabe = new ArrayList<>(List.of(
                new Car("BMW"), new Car("Mercedez")
        ));
        RentalService<Car> rentalService = new RentalService<>(carListAvailabe);

        final Car car = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalService.retornarObjetoAlugado(car);
    }
}
