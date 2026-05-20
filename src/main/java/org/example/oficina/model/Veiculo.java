package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeiculo;

    private String placa;

    private String modelo;

    private Integer ano;

    //TODO: corrigir o relacionamento entre Veiculo e Cliente

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente clienteId;

    @OneToMany(mappedBy = "veiculo")
    @JoinColumn(name = "veiculo")
    private Veiculo veiculo;


}
