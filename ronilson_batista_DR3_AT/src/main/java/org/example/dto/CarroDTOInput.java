package org.example.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroDTOInput {
    private int id;
    private String modelo;
    private String placa;
    private String chassi;
}