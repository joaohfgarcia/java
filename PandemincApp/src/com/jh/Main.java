package com.jh;

import com.jh.entity.Intercambio;
import com.jh.entity.Rede;
import com.jh.entity.RelatorioFactory;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Rede rede = new Rede();
        Intercambio intercambio = new Intercambio();
        RelatorioFactory fabrica = new RelatorioFactory();
        String result;
        String entrada;
        String entrada2 = null;


        Rede redeHospitais = rede.inicializarRede();

        entrada = JOptionPane.showInputDialog("Escolha a opção: \nDigite 1 - Realizar intercâmbio\nDigite 2 - Gerar relatório");
        if (entrada.equals("1")){
            entrada = JOptionPane.showInputDialog("Informe os dados a seguir separados por virgula:\n"+
                            "- Nome do hospital solicitante\n"+
                            "- Descrição do recurso solicitado\n"+
                            "- Quantidade do recurso solicitado\n"+
                            "- Nome do hospital fornecedor\n"+
                            "- Descrição do recurso fornecido\n"+
                            "- Quantidade do recurso fornecido\n");
            result = "Transação sendo processada!";
            String[] dados = entrada.split(",");
            intercambio.realizarIntercambio(redeHospitais, dados[0], dados[1], parseInt(dados[2]), dados[3], dados[4], parseInt(dados[5]));
            JOptionPane.showMessageDialog(null, result);

        }else if (entrada.equals("2")){
            entrada2 = JOptionPane.showInputDialog("Escolha o relatório: " +
                    "\nDigite 1 - Relatório média de recursos da rede" +
                    "\nDigite 2 - Relatório de hospital com maior ocupação acima de 90% " +
                    "\nDigite 3 - Relatório de hospital com maior ocupação abaixo de 90%" +
                    "\nDigite 4 - Relatório de percentual de hospitais com ocupação acima de 90%" +
                    "\nDigite 5 - Relatório de percentual de hospitais com ocupação abaixo de 90%" +
                    "\nDigite 6 - Relatório de histórico de transações");
            result = fabrica.gerarRelatorio(entrada2, redeHospitais);
            JOptionPane.showMessageDialog(null, result);
        }





    }
}
