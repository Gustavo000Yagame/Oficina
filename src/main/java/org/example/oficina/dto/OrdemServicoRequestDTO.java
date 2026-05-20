package org.example.oficina.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record OrdemServicoRequestDTO(

        @NotBlank(message = "A Descrição não pode ser nula")
        String descricaoProblema,


        @NotBlank(message = "O status não pode ficar vazio")
        String status,

        @NotNull(message = "O valor não pode ser nulo")
        Double valorServico

) {}