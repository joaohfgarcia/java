package com.jh.pandemicsystem.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Table(name = "recurso")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private int pontuacao;
    private int estoque;

    @ManyToOne
    @JoinColumn(name="idhospital")
    @JsonIgnore
    private Hospital idhospital;
}
