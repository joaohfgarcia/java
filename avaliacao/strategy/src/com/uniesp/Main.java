package com.uniesp;

import com.uniesp.Entity.DeclaracaoIrpf;
import com.uniesp.Entity.FaixaIrpf;
import com.uniesp.Entity.PessoaFisica;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Francisco José", 30000, 20000, FaixaIrpf.FAIXA1);
        DeclaracaoIrpf declaracao2022 = new DeclaracaoIrpf(pf);
        System.out.println(("DECLARAÇÃO IRPF 2022 de "+pf.getNome()));
        System.out.println(("Imposto a pagar: R$ "+declaracao2022.impostoApagar()));


    }
}
