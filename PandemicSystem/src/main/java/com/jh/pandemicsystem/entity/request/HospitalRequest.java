package com.jh.pandemicsystem.entity.request;

import lombok.Data;

@Data
public class HospitalRequest {
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String fone;
    private Double taxa_ocupacao;
}
