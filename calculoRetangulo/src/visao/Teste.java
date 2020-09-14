package visao;

import java.util.Scanner;
import modelo.Retangulo;

public class Teste {
	
	public static void main(String[] args) {

        float base, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a base:");
        base = entrada.nextFloat();

        System.out.println("Digite a altura:");
        altura = entrada.nextFloat();

        Retangulo r1 = new Retangulo(base, altura);

        System.out.println(r1.calcularArea());

		}

}
