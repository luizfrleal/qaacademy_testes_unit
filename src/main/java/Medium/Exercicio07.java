package Medium;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {

        String[] vetorMesesDoAno;
        vetorMesesDoAno = new String[12];
        
        int i = 0;

        while (i <= 11) {

            vetorMesesDoAno[i] = JOptionPane.showInputDialog("Digite o mês: " + i);

            System.out.println(vetorMesesDoAno[i]);
            i++;
        }

    }

}
