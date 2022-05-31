package com.jh.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RelHospital90mais {

    public String relatorio(Rede redeHospitais){

        String hosp90mais = null;
        var rede = redeHospitais.getRede();
        double maiorOcupacao = 0.0;

        for (int i=0; i<rede.size(); i++) {
            if ((rede.get(i).getTaxa_ocupacao() >= 90) && (rede.get(i).getTaxa_ocupacao() >= maiorOcupacao)){
                hosp90mais ="Nome: "+rede.get(i).getNome() +" - Ocupação: " +rede.get(i).getTaxa_ocupacao()+"%";
            }
        }
        
        return "Hospital com maior ocupação acima de 90%:\n"+hosp90mais;
    }
}
