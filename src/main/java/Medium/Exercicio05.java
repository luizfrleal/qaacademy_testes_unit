package Medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        int numero = 0, i = 1, menor = 0;

        while (i <= 5) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

            if (numero < menor || i == 1) {
                menor = numero;
            }
            i++;
            
        }
        System.out.println("o menor numero é: " + menor);
    }

}
