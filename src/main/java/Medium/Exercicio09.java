package Medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {

        int i = 0;
        String[] nomeAluno;
        nomeAluno = new String[5];

        int[] numeroAluno;
        numeroAluno = new int[5];

        while (i <= 4) {
            nomeAluno[i] = JOptionPane.showInputDialog("Ler nome do Aluno");
            numeroAluno[i] = Integer.parseInt(JOptionPane.showInputDialog("Ler Numero do Aluno"));
            i++;
        }

        i = 0;
        while (i <= 4) {
            System.out.println("O Nome Aluno é : " + nomeAluno[i]);
            System.out.println("O Numero Aluno é : " + numeroAluno[i]);
            i++;
        }

    }

}
