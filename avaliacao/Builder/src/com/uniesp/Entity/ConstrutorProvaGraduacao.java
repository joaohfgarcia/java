package com.uniesp.Entity;

public class ConstrutorProvaGraduacao extends Construtor{

    public void buildQuestoesObjetivas(){
        prova.setQuestoesObjetivas("5");
    }

    public void buildQuestoesDissertativas(){
        prova.setQuestoesDissertativas("3");
    }

    public void buildQuestoesMultiplaEscolha(){
        prova.setQuestoesMultiplaEscolha("2");
    }
}
