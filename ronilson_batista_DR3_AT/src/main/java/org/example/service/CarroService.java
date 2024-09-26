package org.example.service;

import org.example.model.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarroService {

    private List<Carro> listaCarros = new ArrayList<>();

    public List<Carro> listar() {
        return listaCarros;
    }

    public void inserir(Carro carro) {
        listaCarros.add(carro);
    }

    public List<Carro> buscar(int id) {
        return listaCarros;
    }

    public void alterar(int id) {
    }

    public void excluir(int id) {
    }
}
