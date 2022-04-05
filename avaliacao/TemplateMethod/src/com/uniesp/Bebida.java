package com.uniesp;

public abstract class Bebida {

    public void preparar(){
        System.out.println("#### PREPARO DE BEBIDA ###");
        inserirgelo();
        adicionarItens();
        processar();
        servir();
    }

    public void inserirgelo(){
        System.out.println("Adicionano gelo");
    }

    public abstract void adicionarItens();

    public abstract void processar();

    public abstract void servir();
}

