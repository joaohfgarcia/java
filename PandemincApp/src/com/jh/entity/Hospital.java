package com.jh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hospital {
    private String nome;
    private String cnpj;
    private String endereco;
    private String fone;
    private Double taxa_ocupacao;
    private ArrayList<Recurso> recursos = new ArrayList();

    public void addRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }
/*
    public void updateEstoque(Recurso r, int qtde) {
        Recurso recurso = new Recurso();
        recurso.setEstoque(this.recursos.stream().findFirst(r));


    }*/

}
