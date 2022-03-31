package com.uniesp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public abstract class Construtor {

    protected Prova prova;

    public Construtor() {
        prova = new Prova();
    }

    public abstract void buildQuestoesObjetivas();
    public abstract void buildQuestoesDissertativas();
    public abstract void buildQuestoesMultiplaEscolha();

    public Prova getProva(){
        return prova;
    };

}
