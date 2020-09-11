package salario;

public class Salario {
    
    static float irpf (float valor){
        return valor * 0.11f;
    }
    
    static float inss (float valor){
        return valor * 0.08f;
    }
    
    static float sindicato (float valor){
        return valor * 0.05f;
    }
    
    public static void main(String[] args) {
        float valorHora = 10.00f;
        int quantHoras = 50;
        float desc1, desc2, desc3, salarioBruto, desconto, salarioLiquido;
        salarioBruto = valorHora * quantHoras;
        desc1 = irpf (salarioBruto);
        desc2 = inss(salarioBruto);
        desc3 = sindicato(salarioBruto);
        desconto = desc1 + desc2 + desc3;
        salarioLiquido = salarioBruto - desconto;
        System.out.println("Salário Bruto : "+salarioBruto);
        System.out.println("IRPF : "+desc1);
        System.out.println("INSS : "+desc2);
        System.out.println("Sindicato : "+desc3);
        System.out.println("Desconto Total : "+desconto);
        System.out.println("Salário Líquido : "+salarioLiquido);
        

    }
    
}
