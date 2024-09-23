package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Carro {
    private int id;
    private String modelo;
    private String placa;
    private String chassi;
}
