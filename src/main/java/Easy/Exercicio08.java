package Easy;

import javax.swing.JOptionPane;

public class Exercicio08 {
    public static void main(String[] args) {

        Double salario, salarioBruto, valorSalarioLiquido, valorImposto;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite qual é seu salário:"));

        salarioBruto = salario;
        System.out.println("Salário Bruto: " + salarioBruto);

        // Salário Líquido
        if (salario > 0 && salario <= 1903.98) {
            System.out.println("Valor Salário Liquido: " + salario);
            System.out.println("Imposto: Isento");
        }

        if (salario >= 1903.99 && salario <= 2826.65){
            valorImposto = ((salario * 0.075) - 142.80);
        valorSalarioLiquido = salario - valorImposto;
        System.out.println("Valor Salário Liquido: " + valorSalarioLiquido);
        System.out.println("Valor Imposto de Renda: " + valorImposto);
        }

        if (salario>=2826.66 && salario<=3751.05){
             valorImposto=((salario*0.15) - 354.8);
             valorSalarioLiquido=(salario-valorImposto);
            System.out.println("Valor Salário Liquido: " + valorSalarioLiquido);
            System.out.println("Valor Imposto de Renda: " + valorImposto);
            
    }
        
        if (salario>=3751.06 && salario<=4664.68){
            valorImposto=((salario*0.225) - 636.13);
            valorSalarioLiquido=(salario-valorImposto);
            System.out.println ("Valor Salário Liquido: " + valorSalarioLiquido); 
            System.out.println("Valor Imposto de Renda: " +valorImposto);
        }

        if (salario> 4664.68){
        valorImposto=((salario*0.275) - 869.36);
        valorSalarioLiquido=(salario-valorImposto);
        System.out.println ("Valor Salário Liquido: " +valorSalarioLiquido); 
        System.out.println ("Valor Imposto de Renda: " +valorImposto); 

        }
        
    }
}
