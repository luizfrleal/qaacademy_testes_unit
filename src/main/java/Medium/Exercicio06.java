package Medium;

import javax.swing.JOptionPane;

public class Exercicio06 {

    public static void main(String[] args) {
        
        int fatorial, i ;  

        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        i=fatorial;
        
            while (i>1) {
            
            fatorial = fatorial * (i-1);
        
                i--;
            } 
        
            System.out.println(fatorial);
        }

    
    
}
