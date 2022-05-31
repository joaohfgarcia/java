package com.jh.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public class RelMediaRecursos {

    public String relatorio(Rede redeHospitais){

        ArrayList<String> listMedias = new ArrayList<>();
        ArrayList<Recurso> listRecursos = new ArrayList<>();

        var rede = redeHospitais.getRede();
        var qtdeRecurso = rede.get(0).getRecursos().size();
        DecimalFormat df = new DecimalFormat("#.##");
        String item;
        String nome;
        double soma;

        for (int i=0; i<rede.size(); i++) {
            for (int i2 = 0; i2 < qtdeRecurso; i2++) {
                Recurso recurso = new Recurso();
                recurso.setNome(rede.get(i).getRecursos().get(i2).getNome());
                recurso.setEstoque(rede.get(i).getRecursos().get(i2).getEstoque());
                listRecursos.add(recurso);
            }
        }

        for (int i = 0; i < listRecursos.size(); i++) {
            nome = listRecursos.get(i).getNome();
            soma = 0.0;
            for (int i2 = 0; i2 < listRecursos.size(); i2++) {
                if (nome.equals(listRecursos.get(i2).getNome())) {
                    soma += listRecursos.get(i2).getEstoque();
                }
            }
            item = nome + ": " + df.format(soma / rede.size());

            if (!listMedias.contains(item)) {
                listMedias.add(item);
            }
        }

        return "Média de recursos dos hospitais da rede: \n"+listMedias.toString();
    }
}
