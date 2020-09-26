// Calcula madeira consumida para uma moldura retangular

package visao;

import javax.swing.JOptionPane;

import modelo.Moldura;

import modelo.Retangulo;

public class Teste {
	
	public static void main(String[] args) {

        String b_string, a_string, bo_string ;
        
		float base, altura, borda;
        
        b_string = JOptionPane.showInputDialog("Valor da BASE (cm²): ");
        base = Float.parseFloat(b_string);
        
        a_string = JOptionPane.showInputDialog("Valor da ALTURA (cm²): ");
        altura = Float.parseFloat(a_string);
        
        bo_string = JOptionPane.showInputDialog("Valor da BORDA (cm²): ");
        borda = Float.parseFloat(bo_string);
        
        Retangulo r1 = new Retangulo(base, altura);
        
        Retangulo r2 = new Retangulo(base-borda*2, altura-borda*2);
        
        Moldura m1 = new Moldura (r1.calcularArea(),r2.calcularArea());
                 		                    
        JOptionPane.showMessageDialog(null, m1.calcularMoldura());
            

		}

}
