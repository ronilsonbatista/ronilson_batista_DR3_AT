package org.example.service;

import org.example.dto.CarroDTOInput;
import org.example.dto.CarroDTOOutput;
import org.example.model.Carro;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CarroService {

    private List<Carro> listaCarros = new ArrayList<>();
    private ModelMapper modelMapper = new ModelMapper();


    public List<CarroDTOOutput> listar() {
        List<CarroDTOOutput> lista = new ArrayList<>();
        for (Carro carro : listaCarros) {
            CarroDTOOutput carroDTO = modelMapper.map(carro, CarroDTOOutput.class);
            lista.add(carroDTO);
        }
        return lista;
    }

    public void inserir(CarroDTOInput dto) {
        Carro carro = modelMapper.map(dto, Carro.class);
        listaCarros.add(carro);
    }

    public boolean alterar(int id, CarroDTOInput dto) {
        for (int i = 0; i < listaCarros.size(); i++) {
            Carro carro = listaCarros.get(i);
            if (carro.getId() == id) {
                Carro carroAlterado = modelMapper.map(dto, Carro.class);
                carroAlterado.setId(id);
                listaCarros.set(i, carroAlterado);
                return true;
            }
        }
        return false;
    }

    public CarroDTOOutput buscar(int id) {
        for (Carro carro : listaCarros) {
            if (carro.getId() == id) {
                return modelMapper.map(carro, CarroDTOOutput.class);
            }
        }
        return null;
    }

    public boolean excluir(int id) {
        for (int i = 0; i < listaCarros.size(); i++) {
            if (listaCarros.get(i).getId() == id) {
                listaCarros.remove(i);
                return true;
            }
        }
        return false;
    }
}
