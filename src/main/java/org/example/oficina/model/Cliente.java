package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nome;

    private String telefone;

    private String email;

    @OneToMany(mappedBy = "cliente")
    @JoinColumn(name = "cliente")
    private List<Veiculo> Veiculos;

    public Cliente(){}

}
