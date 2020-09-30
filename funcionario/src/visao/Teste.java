/**
Modele um funcionário. Ele deve ter um identificador (int), identificador do setor (int), salario(int), RG (int) e um valor (boolean) que indique se o funcionário ainda está na empresa no momento ou se já foi mandado embora.
- Crie o método bonifica que aumenta o salário do funcionário de acordo com o parâmetro passado.
- Crie o método demite, que não recebe parâmetro algum, só modifica o valor boolean indicado que o funcionário não trabalha mais aqui.
- Crie uma classe Teste para testar e armazenar 5 funcionários.
**/

package visao;

import java.util.Scanner;

import modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		int codFunc, i, operacao;
		float valor;
						
		Funcionario listaFuncionarios[] = new Funcionario[5];
								
		listaFuncionarios[0] = new Funcionario (1, 10, 123455, 550.00f, true);
		listaFuncionarios[1] = new Funcionario (2, 10, 123456, 650.00f, true);
		listaFuncionarios[2] = new Funcionario (3, 20, 123457, 1050.00f, true);
		listaFuncionarios[3] = new Funcionario (4, 20, 123458, 950.00f, true);
		listaFuncionarios[4] = new Funcionario (5, 10, 123459, 800.00f, true);
		
		for (i=0; i<listaFuncionarios.length; i++) {
			System.out.println(":: CADASTRO FUNCIONÁRIO :: ");
			System.out.println("Funcionário: "+listaFuncionarios[i].getIdFunc());
			System.out.println("Setor: "+listaFuncionarios[i].getIdSetor());
			System.out.println("RG: "+listaFuncionarios[i].getRg());
			System.out.println("Salário: "+listaFuncionarios[i].getSalario());
			System.out.println("Ativo: "+listaFuncionarios[i].getStatus());	
		}	
				
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o codigo do funcionário a ser alterado: ");
		codFunc = entrada.nextInt();
		i = codFunc-1;
		
		System.out.println(":: Deseja executar qual operação? Bonificar [1] ou Demitir [2]: ");
		operacao = entrada.nextInt();
								
		if (operacao == 1) {
			System.out.println("Digite o valor a ser bonificado: ");
			valor = entrada.nextFloat();
			listaFuncionarios[i].bonifica(valor);
			System.out.println(":: CADASTRO ALTERADO :: ");
			System.out.println("Funcionário: "+listaFuncionarios[i].getIdFunc());
			System.out.println("Novo Salário: "+listaFuncionarios[i].getSalario());
			
		}else if (operacao == 2) {
			listaFuncionarios[i].demite();
			System.out.println(":: CADASTRO ALTERADO :: ");
			System.out.println("Funcionário: "+listaFuncionarios[i].getIdFunc());
			System.out.println("Ativo: "+listaFuncionarios[i].getStatus());
			
		}else {
			System.out.println("Operação Inválida");
		}

	}

}
