package org.example.oficina.dto;

public record VeiculoResponseDTO(

        Long idVeiculo,

        String placa,

        String modelo,

        Integer ano,

        Long clienteId

        //TODO: retornar informações do cliente
) {
}
