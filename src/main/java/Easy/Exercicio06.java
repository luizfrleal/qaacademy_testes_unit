package Easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        int nota1, nota2, media;
        String nota1string = JOptionPane.showInputDialog("Digite a primeira nota: ");
        String nota2string = JOptionPane.showInputDialog("Digite a segunda nota: ");

        nota1 = Integer.parseInt(nota1string);
        nota2 = Integer.parseInt(nota2string);

        media = (nota1 + nota2) / 2;

        if (media > 5) {

            System.out.println("Aprovado");
        }

        if (media < 5) {

            System.out.println("Reprovado");
        }
        if (media == 5) {

            System.out.println("Exame");
        }
    }

}
