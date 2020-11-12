package modelo;

public class Publicacao {
	
	private String titulo;
	private String data;
	private Editora editora;
	
	public Publicacao(String titulo, String data, Editora editora) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.editora = editora;
	}
	
	public Publicacao() {}
	
	public void cadastrarPublicacao(Editora editora) {
		this.editora = editora;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public String toString() {
		return "Publicacao [titulo=" + titulo + ", data=" + data + ", editora=" + editora + "]";
	}
	
	
	
}
