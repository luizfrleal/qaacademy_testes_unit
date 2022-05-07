package Easy;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main(String[] args) {

        int numero1, numero2, numero3;
        String primeiroNumero = JOptionPane.showInputDialog("Digite primeiro número : ");
        String segundoNumero = JOptionPane.showInputDialog("Digite segundo número: ");
        String terceiroNumero = JOptionPane.showInputDialog("Digite terceiro número : ");

        numero1 = Integer.parseInt(primeiroNumero);
        numero2 = Integer.parseInt(segundoNumero);
        numero3 = Integer.parseInt(terceiroNumero);

        System.out.println("Soma dos numeros digitados=" + (numero1 + numero2 + numero3));
        System.out.println("Subitração dos numeros digitados=" + (numero1 - numero2 - numero3));
        System.out.println("Soma dos numeros digitados=" + (numero1 * numero2 * numero3));
        System.out.println("Soma dos numeros digitados=" + ((numero1 + numero2 + numero3) / 3));
    }
}
