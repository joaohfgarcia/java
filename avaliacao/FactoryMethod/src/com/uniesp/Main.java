package com.uniesp;

import com.uniesp.entity.CasaPadrao;
import com.uniesp.entity.FactoryCasa;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String entrada;
        String projeto;

        entrada = JOptionPane.showInputDialog("Digite o numero do projeto desejado:" +
                " 1 - Padrão, 2 - Médio Padrão, 3 - Alto Padrão ");

        FactoryCasa fabrica = new FactoryCasa();

        projeto = fabrica.gerarProjeto(entrada);

        JOptionPane.showMessageDialog(null, projeto);

    }

}
