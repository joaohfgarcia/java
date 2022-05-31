package com.jh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Recurso {
    private String nome;
    private int pontuacao;
    private int estoque;
}
