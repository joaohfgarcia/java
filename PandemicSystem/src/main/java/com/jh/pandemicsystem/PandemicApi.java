package com.jh.pandemicsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*  Porcentagem de hospitais com ocupação maior que 90%. OK
    Porcentagem de hospitais com ocupação menor que 90%. OK
    Quantidade média de cada tipo de recurso por hospital (Ex: 2 tomógrafos por hospital).
    Hospital em super-lotação (ocupação maior que 90%) a mais tempo. OK
    Hospital em abaixo de super-lotação (ocupação maior que 90%) a mais tempo. OK
    Histórico de negociação.*/

@SpringBootApplication
public class PandemicApi {

    public static void main(String[] args) {
        SpringApplication.run(PandemicApi.class, args);
    }

}
