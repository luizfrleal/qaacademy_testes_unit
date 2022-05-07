package Easy;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {

        String palavra1, palavra2;

        palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra:");
        palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra:");

        System.out.println("Segunda Palavra Digitada: " + palavra2);
        System.out.println("Primeira Palavra Digitada: " + palavra1);

    }
}
