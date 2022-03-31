package com.uniesp.Entity;

public class Tse {
    private ServidorTre servidorTre;
    private ServidorTse servidorTse;
    private UrnaEletronica urnaEletronica;

    public Tse() {
        this.servidorTre = new ServidorTre();
        this.servidorTse = new ServidorTse();
        this.urnaEletronica = new UrnaEletronica();
    }

    public void apuracaoEleicoes() {
        servidorTre.enviaVotosTse();
        servidorTse.processaVotos();
        urnaEletronica.recebeVotos();
    }
}
