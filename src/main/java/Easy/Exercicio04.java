package Easy;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        numero = (numero * 2);
        System.out.println("o dobro do numero digitado é:" + numero);

    }
}
