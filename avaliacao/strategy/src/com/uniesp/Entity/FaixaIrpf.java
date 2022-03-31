package com.uniesp.Entity;

public enum FaixaIrpf implements CalculaIrpf {
    FAIXA1 {
        @Override
        public float calculaImposto(float valor) {
            return (float) (valor * 0.075);
        }
    },
    FAIXA2 {
        @Override
        public float calculaImposto(float valor) {
            return (float) (valor * 0.150);
        }
    },
    FAIXA3 {
        @Override
        public float calculaImposto(float valor) {
            return (float) (valor * 0.225);
        }
    },
    FAIXA4 {
        @Override
        public float calculaImposto(float valor) {
            return (float) (valor * 0.275);
        }
    },
}
