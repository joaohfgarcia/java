package com.uniesp;

public class Coquetel extends Bebida{

    @Override
    public void adicionarItens() {
        System.out.println("Adicionano frutas e vodka");
    }

    @Override
    public void processar() {
        System.out.println("Agitando mistura na coqueteleira");
    }

    @Override
    public void servir() {
        System.out.println("Servindo em uma taça");
    }
}
