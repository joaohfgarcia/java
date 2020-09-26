package modelo;

public class Moldura {
	private float areaR1, areaR2;
	
	public Moldura (float a1, float a2) {
		this.areaR1 = a1;
		this.areaR2 = a2;
		
	}
	
	public String calcularMoldura() {
		
		float areaMoldura;
		
		areaMoldura = areaR1 - areaR2;
		
		return ("A moldura tem "+areaMoldura+" cm² de madeira"); 
		
	}

	public float getAreaR1() {
		return areaR1;
	}

	public void setAreaR1(float areaR1) {
		this.areaR1 = areaR1;
	}

	public float getAreaR2() {
		return areaR2;
	}

	public void setAreaR2(float areaR2) {
		this.areaR2 = areaR2;
	}
	
	
	
	
}
