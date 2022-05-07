package Easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        
        int numero, soma, i=1;

         numero = Integer.parseInt (JOptionPane.showInputDialog("Digite o numero"));
        soma=numero;
        
        
        while (i<=100) {
            
            soma=(soma+2);
            System.out.println(  soma);
            i=i+1;
            
        }


    }
}
