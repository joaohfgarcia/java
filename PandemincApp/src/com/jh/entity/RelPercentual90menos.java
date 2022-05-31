package com.jh.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;

@Data
@NoArgsConstructor
public class RelPercentual90menos {

    public String relatorio(Rede redeHospitais) {

        DecimalFormat df = new DecimalFormat("#.##");
        var rede = redeHospitais.getRede();
        double cont = 0.0;

        for (int i = 0; i < rede.size(); i++) {
            if (rede.get(i).getTaxa_ocupacao() < 90) {
                cont++;
            }
        }

        return "Percentual de hospitais abaixo de 90% de ocupação: "+df.format(cont*100/rede.size())+"%";
    }
}
