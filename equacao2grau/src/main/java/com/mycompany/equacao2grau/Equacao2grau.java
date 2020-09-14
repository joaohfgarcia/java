package com.mycompany.equacao2grau;

// solucionar equação do 2o grau

public class Equacao2grau {
    public static void main(String[] args) {
        int a, b, c;
        double delta, x1, x2;
        a = 2;
        b = -5;
        c = -3;
        // delta = b²-4.a.c
        // bascara x1,2 = (-b +- raiz quarada de delta)/2a
        delta = (b*b)-4*a*c;
        System.out.println("Valor de Delta : "+delta);
        if (delta < 0){
            System.out.println("A equação não terá raízes reais, pois não existe raiz quadrada de número negativo!");      
        }else if (delta == 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            System.out.println("A equação possui apenas uma raiz: "+x1);      
        }else{
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Valor da raiz X1 é : "+x1);
            System.out.println("Valor da raiz X2 é : "+x2);
        }              
    }
}
