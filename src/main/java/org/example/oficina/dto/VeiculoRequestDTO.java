package org.example.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VeiculoRequestDTO(

        //TODO: colocar validações de entrada de dados
        @NotBlank(message = "Placa invalida!")
        String placa,

        @NotBlank(message = "Digite um modelo valido!")
        String modelo,

        @NotNull(message = "Ano invalido!")
        Integer ano,

        @NotNull(message = "Cliente não encontrado")
        Long clienteId
) {
}
