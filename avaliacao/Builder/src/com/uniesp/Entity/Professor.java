package com.uniesp.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Professor {

    private Construtor geradorProva;

    public void gerarProva(){
        geradorProva.buildQuestoesObjetivas();
        geradorProva.buildQuestoesDissertativas();
        geradorProva.buildQuestoesMultiplaEscolha();
    }

    public Prova imprimirProva(){
        return geradorProva.getProva();
    }

}
