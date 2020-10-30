
package modelo;


public class Calculo {

    
    private double valor1;
    private double valor2;
    private String operacao;

    public Calculo(double valor1, double valor2, String op) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = op;
    }
        
    public String totalizar(){
        double resultado = 0; 
        if ("soma".equals(this.operacao)){
           resultado = valor1+valor2;
        }else if ("sub".equals(this.operacao)){
           resultado = valor1-valor2;
        }else if ("mult".equals(this.operacao)){
           resultado = valor1*valor2;
        }else if ("div".equals(this.operacao)){
           resultado = valor1/valor2;
        }
        return Double.toString(resultado); 
    
    }
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
}
