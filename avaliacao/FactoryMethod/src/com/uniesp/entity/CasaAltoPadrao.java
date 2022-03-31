package com.uniesp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasaAltoPadrao extends CasaPadrao{

    String piscina;

    public String projeto(){
        areaConstruida = "300m²";
        comodos = "16";
        material = "Premium";
        pavimentos = "Triplex";
        piscina = "20m²";
        return "Casa Alto Padrão{" +
                "Área Construída='" + areaConstruida + '\'' +
                ", Cômodos='" + comodos + '\'' +
                ", Material Utilizado='" + material + '\'' +
                ", Pavimento(s)='" + pavimentos + '\'' +
                ", Piscina ='" + piscina + '\'' +
                '}';
    }
}
