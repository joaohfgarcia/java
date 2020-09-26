package modelo;

public class Retangulo {

	private float lado1, lado2;
		
	public Retangulo(float l1, float l2) {
		this.lado1 = l1;
		this.lado2 = l2;
	}
	
	public Retangulo() {}

	public float calcularArea() {
		float area;
		area = lado1*lado2;
		return area;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	
	
	
	
}
