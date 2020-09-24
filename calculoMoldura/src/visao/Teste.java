// Calcula madeira consumida para uma moldura retangular

package visao;

import javax.swing.JOptionPane;

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
        
        Retangulo r1 = new Retangulo(base, altura, borda);
                      
        JOptionPane.showMessageDialog(null, r1.calcularMaterial());
        
        



		}

}
