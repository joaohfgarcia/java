package salario;

public class Salario {
           
    public static void main(String[] args) {
        float valorHora = 10.00f;
        int quantHoras = 50;
        float irpf, inss, sindicato, salarioBruto, desconto, salarioLiquido;
        salarioBruto = valorHora * quantHoras;
        irpf = salarioBruto * 0.11f;
        inss = salarioBruto * 0.08f;
        sindicato = salarioBruto * 0.03f;
        desconto = irpf + inss + sindicato;
        salarioLiquido = salarioBruto - desconto;
        System.out.println("Salário Bruto : "+salarioBruto);
        System.out.println("IRPF : "+irpf);
        System.out.println("INSS : "+inss);
        System.out.println("Sindicato : "+sindicato);
        System.out.println("Desconto Total : "+desconto);
        System.out.println("Salário Líquido : "+salarioLiquido);
        

    }
    
}
