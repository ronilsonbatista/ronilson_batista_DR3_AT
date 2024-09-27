package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.CarroDTOInput;
import org.example.service.CarroService;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.delete;
import static spark.Spark.put;

public class CarroController {

    private final CarroService service = new CarroService();
    private final ObjectMapper objMapper = new ObjectMapper();

    public void respostasRequisicoes() {
        get("/carros", (request, response) -> {
            response.type("application/json");
            response.status(200);
            String json = objMapper.writeValueAsString(service.listar());
            return json;
        });

        get("/carros/:id", (request, response) -> {
            response.type("application/json");
            String idParam = request.params("id");
            Long id = Long.valueOf(idParam);
            String json = objMapper.writeValueAsString(service.buscar(0));
            response.status(200);
            return json;
        });

        post("/carros", (request, response) -> {
            CarroDTOInput dto = objMapper.readValue(request.body(), CarroDTOInput.class);
            service.inserir(dto);
            response.type("application/json");
            response.status(201);
            return "Produto inserido com sucesso.";
        });

        put("/carros", (request, response) -> {
            CarroDTOInput dto = objMapper.readValue(request.body(), CarroDTOInput.class);
            int idParam = Integer.parseInt(request.params("id"));
            service.alterar(idParam, dto);
            response.type("application/json");
            response.status(200);
            return "Produto alterado com sucesso.";
        });

        delete("/carros/:id", (request, response) -> {
            response.type("application/json");
            int idParam = Integer.parseInt(request.params("id"));
            service.excluir(idParam);
            response.status(200);
            return "Produto excluido com sucesso.";
        });
    }
}
