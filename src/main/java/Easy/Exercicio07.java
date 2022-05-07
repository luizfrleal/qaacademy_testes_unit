package Easy;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {

        Double salario;
        Double valorInss;
        

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite se salário"));

        if (salario <= 1045.00) {

            valorInss = ((salario * 0.075));
            System.out.println("INSS:" + valorInss);

        }

        if (salario >= 1045.01 && salario <= 2089.60) {
            valorInss = ((salario * 0.09));
            System.out.println("INSS: " + valorInss);

        }

        if (salario >= 2089.61 && salario <= 3134.40) {
            valorInss = (salario * 0.12);
            System.out.println("Valor INSS: " + valorInss);
        }

        if (salario >= 3134.41 && salario <= 6101.06) {
            valorInss = (salario * 0.14);
            System.out.println("Valor INSS: " + valorInss);
        }

        if (salario > 6101.06) {
            valorInss = (854.15);
            System.out.println("Valor INSS: " + valorInss);
        }

    }
}
