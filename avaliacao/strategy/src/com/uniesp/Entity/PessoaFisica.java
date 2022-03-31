package com.uniesp.Entity;

public class PessoaFisica {
    private String nome;
    private float rendimentos;
    private float despesas;
    private FaixaIrpf faixaIrpf;

    public PessoaFisica() { }

    public PessoaFisica(String nome, float rendimentos, float despesas, FaixaIrpf faixaIrpf) {
        this.nome = nome;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
        this.faixaIrpf = faixaIrpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(float rendimentos) {
        this.rendimentos = rendimentos;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setDespesas(float despesas) {
        this.despesas = despesas;
    }

    public void setFaixaIrpf(FaixaIrpf faixaIrpf) {
        this.faixaIrpf = faixaIrpf;
    }

    public FaixaIrpf getFaixaIrpf(){
        return faixaIrpf;
    }


}
