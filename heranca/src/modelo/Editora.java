package modelo;

public class Editora {
	
	private int cod;
	private String nome;
	
	public Editora(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	public Editora () {}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "Editora [Código: " + cod + ", Nome: " + nome + "]";
	}
	
	
}
