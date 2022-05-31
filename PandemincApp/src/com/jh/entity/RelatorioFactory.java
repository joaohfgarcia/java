package com.jh.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RelatorioFactory extends AbstractRelatorioFactory {

    @Override
    public String gerarRelatorio(String e, Rede r) {
        String entrada = e;

        switch (e){
            case "1":
                return new RelMediaRecursos().relatorio(r);
            case "2":
                return new RelHospital90menos().relatorio(r);
            case "3":
                return new RelHospital90mais().relatorio(r);
            case "4":
                return new RelPercentual90menos().relatorio(r);
            case "5":
                return new RelPercentual90mais().relatorio(r);
            case "6":
                return new RelHistorico().relatorio(r);
            default:
                return "Opção Inválida";
        }
    }


}
