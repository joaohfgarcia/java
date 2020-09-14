package modelo;

public class Retangulo {

	private float lado1, lado2, areaTotal;
		
	public Retangulo(float l1, float l2) {
		this.lado1 = l1;
		this.lado2 = l2;
	}

	public String calcularArea() {
		areaTotal = lado1 * lado2;
		return ("A área do retângulo é: "+ areaTotal);
	}
	
}
