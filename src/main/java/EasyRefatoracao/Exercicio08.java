package EasyRefatoracao;

public class Exercicio08 {

    public String calculoImpos(double salario) {

        double valorImposto;
        double valorsalarioBruto;
        double valorSalarioLiquido;

        valorsalarioBruto = salario;
        // System.out.println("Valor salário Bruto: " + valorsalarioBruto);

        if (salario > 0 && salario <= 1903.98) {

            return "Valor salário Bruto: " + valorsalarioBruto + "\n" +
                    "Imposto: Isento ";

        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            valorImposto = ((salario * 0.075) - 142.80);
            valorSalarioLiquido = salario - valorImposto;
            // System.out.println("Valor Salário Liquido: " + valorSalarioLiquido);

            return "Valor Salário Bruto: " + valorsalarioBruto + "\n" +
                    "Valor Salário Liquido: " + valorSalarioLiquido + "\n" +
                    "Valor Imposto de Renda: " + valorImposto;

        }

        if (salario >= 2826.66 && salario <= 3751.05) {
            valorImposto = ((salario * 0.15) - 354.8);
            valorSalarioLiquido = salario - valorImposto;

            return "Valor Salário Bruto: " + valorsalarioBruto + "\n" +
                    "Valor Salário Liquido: " + valorSalarioLiquido + "\n" +
                    "Valor Imposto de Renda: " + valorImposto;

        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            valorImposto = ((salario * 0.225) - 636.13);
            valorSalarioLiquido = salario - valorImposto;
            return "Valor Salário Bruto: " + valorsalarioBruto + "\n" +
                    "Valor Salário Liquido: " + valorSalarioLiquido + "\n" +
                    "Valor Imposto de Renda: " + valorImposto;

        }
        if (salario > 4664.68) {
            valorImposto = ((salario * 0.275) - 869.36);
            valorSalarioLiquido = salario - valorImposto;
            return "Valor Salário Bruto: " + valorsalarioBruto + "\n" +
                    "Valor Salário Liquido: " + valorSalarioLiquido + "\n" +
                    "Valor Imposto de Renda: " + valorImposto;

        }

        return "";
        // valorSalarioLiquido=valorsalarioBruto - valorImposto;

    }


}
