package com.uniesp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CasaMedioPadrao extends CasaPadrao{

    public String projeto(){
        areaConstruida = "120m²";
        comodos = "8";
        material = "Standard";
        pavimentos = "Duplex";
        return "Casa Médio Padrão{" +
                "Área Construída='" + areaConstruida + '\'' +
                ", Cômodos='" + comodos + '\'' +
                ", Material Utilizado='" + material + '\'' +
                ", Pavimento(s)='" + pavimentos + '\'' +
                '}';
    }


}
