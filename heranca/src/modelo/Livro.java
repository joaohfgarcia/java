package modelo;

public class Livro extends Publicacao {
	
	private String isbn;

	public Livro(String titulo, String data, Editora editora, String isbn) {
		super(titulo, data, editora);
		this.isbn = isbn;
	}
	
	public Livro(String titulo, String data, String isbn) {
		super(titulo, data, null);
		this.isbn = isbn;
	}
	
	public Livro() {}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString() {
		return "Livro   [Titulo: " + this.getTitulo() + ", Data: " +this.getData()
		+", ISBN: " + isbn + "]";
	}
	
	

}
