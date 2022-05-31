package com.jh.pandemicsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "hospital")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String fone;
    private Double taxa_ocupacao;

    @OneToMany(mappedBy = "idhospital", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"id", "pontuacao"})
    private List<Recurso> recursos;

}