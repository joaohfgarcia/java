package visao;

import modelo.Editora;
import modelo.Livro;
import modelo.Revista;

public class Teste {

	public static void main(String args[]) {
		
		Editora book = new Editora(1, "Editora Mussum");
		
		Revista rev = new Revista("Cacildis", "01/10/2019", "Mensal");
		Livro liv = new Livro("Litros Abertis", "01/08/2000", "29450225635");
		
		rev.cadastrarPublicacao(book);
		liv.cadastrarPublicacao(book);
		
		System.out.println();
		System.out.println(book);
		System.out.println(rev);
		System.out.println(liv);
		

	}

}
