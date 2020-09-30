package modelo;

public class Funcionario {
	private int idFunc, idSetor, rg;
	private float salario;
	private boolean status;
	
	public Funcionario (int idF, int idS, int rg, float sal, boolean stt) {
		this.idFunc = idF;
		this.idSetor = idS;
		this.rg = rg;
		this.salario = sal;
		this.status = stt;
		
	}
	
	public Funcionario () {}
	
	public float bonifica(float aumento) {
		this.salario = this.salario + aumento; 
		return (this.salario);
		
	}
	
	
	public boolean demite() {
		this.status = false;
		
		return (this.status); 
	}

	public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public int getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
	
	
	

}
