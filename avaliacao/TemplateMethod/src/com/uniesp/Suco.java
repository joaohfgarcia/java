package com.uniesp;

public class Suco extends Bebida {


    @Override
    public void adicionarItens() {
        System.out.println("Adicionando frutas");
    }

    @Override
    public void processar() {
        System.out.println("Triturando mistura no liquidificador");
    }

    @Override
    public void servir() {
        System.out.println("Servindo em um copo");
    }

}
