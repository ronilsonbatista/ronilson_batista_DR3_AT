package org.example;
import org.example.controller.CarroController;
import org.example.service.CarroService;


import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(4567);

        CarroService carroService = new CarroService();
        CarroController carroController = new CarroController(carroService);

        carroController.respostasRequisicoes();
    }
}