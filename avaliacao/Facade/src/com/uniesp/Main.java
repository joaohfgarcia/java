package com.uniesp;

import com.uniesp.Entity.Tse;

public class Main {

    public static void main(String[] args) {
        Tse facade = new Tse();
        facade.apuracaoEleicoes();
        System.out.println("[TSE] Divulgação do Resultado das Eleições");
    }
}
