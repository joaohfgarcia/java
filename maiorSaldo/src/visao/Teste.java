/*Crie um projeto que utilize um ArrayList de objetos da classe Conta 
e determine o número da conta de maior saldo 
Conta deve ter os atributos: numero (int) e saldo (double), 
além de seu construtores, gets, sets, toString.*/


package visao;

import java.util.Scanner;

import modelo.Conta;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		
		int numConta;
		int indice=0;
		double saldoConta;
		double maiorSaldo=0;
		ArrayList banco = new ArrayList();
				
		Scanner entrada = new Scanner(System.in);		        
		
		for(int i = 0; i < 3; i++){
			
			System.out.println("Nº Conta Corrente:");
			numConta = entrada.nextInt();
			System.out.println("Saldo Conta Corrente:");
			saldoConta = entrada.nextDouble();
			
			Conta c1 = new Conta(numConta, saldoConta);
			banco.add(c1);
			
			if (saldoConta > maiorSaldo){
				indice = i;
				maiorSaldo = saldoConta;
				}
			
			} 		
		System.out.println("Maior Saldo [ "+banco.get(indice)+ "]");
		
	}

}
