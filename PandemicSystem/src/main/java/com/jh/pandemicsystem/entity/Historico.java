package com.jh.pandemicsystem.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table(name = "historico")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @ManyToOne(cascade = CascadeType.ALL)
    private Hospital hospSolicitante;

    @ManyToOne(cascade = CascadeType.ALL)
    private Hospital hospFornecedor;

    @ManyToOne(cascade = CascadeType.ALL)
    private Recurso recursoSolicitado;

    @ManyToOne(cascade = CascadeType.ALL)
    private Recurso recursoFornecido;
}
