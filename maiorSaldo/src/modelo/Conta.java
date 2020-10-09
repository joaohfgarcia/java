package modelo;

public class Conta {
	private int numcc;
	private double saldo;
	
	public Conta() {}
	
	public Conta (int cc, double sld) {
		this.numcc = cc;
		this.saldo = sld;
	}
	
	public String toString() {
		return "Conta Corrente: "+this.numcc+" - Saldo: "+this.saldo;
				
	}

	public int getNumcc() {
		return numcc;
	}

	public void setNumcc(int numcc) {
		this.numcc = numcc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
		
}
	
