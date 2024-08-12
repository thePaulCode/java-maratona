package Zgenerics.domain;

import Zgenerics.service.CarRentalService;

public class GenergicTest01 {
    public static void main(String[] args) {
        final CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carRentalService.retornarCarroAlugado(car);

    }
}
