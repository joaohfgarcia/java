package modelo;

public class Retangulo {

	private float lado1, lado2, borda1;
		
	public Retangulo(float l1, float l2, float b1) {
		this.lado1 = l1;
		this.lado2 = l2;
		this.borda1 = b1;
	}
	
	public Retangulo() {}

	public String calcularMaterial() {
		float area;
		
		area = lado1*lado2 - (lado1-borda1)*(lado2-borda1);
				
		return ("O consumo de madeira para a moldura será de : " + area + "cm²");
	}
	
}
