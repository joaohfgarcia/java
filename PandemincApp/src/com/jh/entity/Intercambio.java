package com.jh.entity;

public class Intercambio {

    public void realizarIntercambio(Rede rede, String hospSolicitante, String recursoSolicitado, int qtdeSolicitada,
                                    String hospFornecedor, String recursoFornecido, int qtdeFornecida){

        var redeHosp = rede.getRede();
        String hospSol = hospSolicitante;
        String hospForn = hospFornecedor;
        String recursoSol = recursoSolicitado;
        String recursoForn = recursoFornecido;
        int qtSol = qtdeSolicitada;
        int qtForn = qtdeFornecida;
        int sumRecurso = 0;
        int subRecurso = 0;
        int totalPtosSolicitacao = 0;
        int totalPtosFornecimento = 0;
        int indexHSol = 0;
        int indexRSol = 0;
        int indexHForn = 0;
        int indexRForn = 0;

        for (int i = 0; i<redeHosp.size(); i++){
            if (redeHosp.get(i).getNome().equals(hospSol)){
                for (int i2=0; i2<redeHosp.get(i).getRecursos().size(); i2++){
                    totalPtosSolicitacao = redeHosp.get(i).getRecursos().get(i2).getPontuacao()*qtSol;
                    indexHSol = i;
                    indexRSol = i2;

                }
            }
            if (redeHosp.get(i).getNome().equals(hospForn)){
                for (int i2=0; i2<redeHosp.get(i).getRecursos().size(); i2++){
                    totalPtosFornecimento = redeHosp.get(i).getRecursos().get(i).getPontuacao()*qtForn;
                    indexHForn = i;
                    indexRForn = i2;
                }
            }
        }
        if ((totalPtosSolicitacao>=totalPtosFornecimento) ||(redeHosp.get(indexHSol).getTaxa_ocupacao() > 90)) {
            sumRecurso = redeHosp.get(indexHSol).getRecursos().get(indexRSol).getEstoque() + qtdeSolicitada;
            redeHosp.get(indexHSol).getRecursos().get(indexRSol).setEstoque(sumRecurso);
            subRecurso = redeHosp.get(indexHForn).getRecursos().get(indexRForn).getEstoque() + qtdeFornecida;
            redeHosp.get(indexHForn).getRecursos().get(indexRForn).setEstoque(subRecurso);
        }
    }
}
