package com.uniesp.Entity;

public class DeclaracaoIrpf{
    private final PessoaFisica pessoafisica;


    public DeclaracaoIrpf(PessoaFisica pessoafisica) {
        this.pessoafisica = pessoafisica;
    }


    public float impostoApagar(){
        float redimentosExcedentes = this.pessoafisica.getRendimentos() - this.pessoafisica.getDespesas();
        FaixaIrpf faixaIrpf = this.pessoafisica.getFaixaIrpf();
        return faixaIrpf.calculaImposto(redimentosExcedentes);
    }

}
