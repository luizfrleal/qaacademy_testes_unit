package Easy;

import javax.swing.JOptionPane;

public class Exercicio09 {

    // private static final String Int = null;

    public static void main(String[] args) {

        int numero, resultado, i = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja saber a tabuada"));

        if (numero >= 1 && numero <= 10) {

            while (i <= 10){

                resultado = numero * i;
                System.out.println(numero +  " x "  + i + " = " + resultado);
                i = i + 1;

                
            }
        }
    }

}
