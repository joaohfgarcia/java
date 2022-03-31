package com.uniesp;

import com.uniesp.Entity.ConstrutorProvaGraduacao;
import com.uniesp.Entity.ConstrutorProvaPosGraduacao;
import com.uniesp.Entity.Professor;
import com.uniesp.Entity.Prova;

public class Main {

    public static void main(String[] args) {

        Professor profGraduacao = new Professor(new ConstrutorProvaGraduacao());
        profGraduacao.gerarProva();
        Prova provaGraduacao = profGraduacao.imprimirProva();
        System.out.println("### PROVA GRADUACAO ###");
        System.out.println(provaGraduacao.toString());

        Professor profPosGraduacao = new Professor(new ConstrutorProvaPosGraduacao());
        profPosGraduacao.gerarProva();
        System.out.println("### PROVA POS-GRADUACAO ###");
        Prova provaPosGraduacao = profPosGraduacao.imprimirProva();
        System.out.println(provaPosGraduacao.toString());
    }
}
