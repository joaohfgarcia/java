package modelo;

public class Revista extends Publicacao {
	
	private String periodicidade;
	
	public Revista(String titulo, String data, Editora editora, String periodicidade) {
		super(titulo, data, editora);
		this.periodicidade = periodicidade;
	}
	
	public Revista(String titulo, String data, String periodicidade) {
		super(titulo, data, null);
		this.periodicidade = periodicidade;
	}
	
	public Revista() {}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String toString() {
		return "Revista [Titulo: "+ this.getTitulo() + ", Data: " + this.getData()
		+ ", Periodicidade: " + periodicidade + "]";
	}
	
	

}
