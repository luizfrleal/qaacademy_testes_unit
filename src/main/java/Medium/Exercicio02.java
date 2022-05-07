package Medium;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        double valorInvestimento, juros = 0.05, valorTotal;
        int i = 1;

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido"));

        valorTotal = valorInvestimento;

        while (i <= 10) {
            valorTotal = (valorTotal * juros) + valorTotal;
            i++;
        }

        juros = valorTotal - valorInvestimento;

        System.out.println("Valor Investido:" + valorInvestimento);
        System.out.println("Valor dos juros ao final de 10 anos é:" + juros);
        System.out.println("Valor Total do investimento com juros é:" + valorTotal);
    }
}
