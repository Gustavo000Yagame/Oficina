package org.example.oficina.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class OrdemServico {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idOrdemServico;

    private String descricaoProblema;

    private String status;

    private Double valorServico;

    //TODO: transformar em entidade e colocar relacionamento

    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private List<OrdemServico> ordemServico;

}
