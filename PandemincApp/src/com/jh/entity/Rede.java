package com.jh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rede {

    ArrayList<Hospital> rede = new ArrayList<>();

    public Rede inicializarRede(){
        for (int i=1; i<4; i++){
            Hospital hospital = new Hospital();
            hospital.setNome("Hospital "+i);
            hospital.setCnpj("999999"+i*3);
            hospital.setEndereco("Rua "+ i*3);
            hospital.setFone("99999-0000");
            hospital.setTaxa_ocupacao((double) (88+i));
            hospital.addRecurso(new Recurso("Médico", 3, 5 + i * 2));
            hospital.addRecurso(new Recurso("Enfermeiro", 3, 10 + i * 2));
            hospital.addRecurso(new Recurso("Respirador", 5, 8 + i * 2));
            hospital.addRecurso(new Recurso("Tomógrafo", 12, 5 + i * 2));
            hospital.addRecurso(new Recurso("Ambulância", 10, 2 + i * 2));
            rede.add(hospital);
        }
        return this;
    }



}
