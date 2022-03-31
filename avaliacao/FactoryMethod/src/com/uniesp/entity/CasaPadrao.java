package com.uniesp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasaPadrao {

    String areaConstruida;
    String comodos;
    String material;
    String pavimentos;

    public String projeto(){
        areaConstruida = "60m²";
        comodos = "4";
        material = "Popular";
        pavimentos = "Térreo";
        return "Casa Padrão{" +
                "Área Construída='" + areaConstruida + '\'' +
                ", Cômodos='" + comodos + '\'' +
                ", Material Utilizado='" + material + '\'' +
                ", Pavimento(s)='" + pavimentos + '\'' +
                '}';
    }
}
