package com.jh.pandemicsystem.entity.response;

import lombok.Data;

@Data
public class HospitalResponse {
    private Long id;
    private String nome;
    private String endereco;
    private String fone;
    private Double taxa_ocupacao;
}
