package com.uniesp.entity;

public class FactoryCasa extends AbstractFactoryCasa{

    public FactoryCasa() {}

       public String gerarProjeto(String e) {
        String entrada = e;

        if (entrada.equals("1")) {
            return new CasaPadrao().projeto();

        } else if (entrada.equals("2")) {
            return new CasaMedioPadrao().projeto();

        } else if (entrada.equals("3")) {
            return new CasaAltoPadrao().projeto();

        } else {
            return ("Opção inválida");
        }
    }
}
