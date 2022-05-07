package Metodos;

import javax.swing.JOptionPane;

public class ExercicioMetodoComRetorno {
    public static void main(String[] args) {
        String verificar = nota0();
        System.out.println(verificar);
        String verificar2 = nota1();
        System.out.println(verificar2);
        System.out.println(nota3());
        System.out.println(nome2());
    }
    

    public static String nota0() {
        int nota = 11;
        if (nota >= 10) {

            return "Aprovado";

        } else {
            return "Reprovado";
        }

    }

public static String nota1 () {
    int nota = 11;
    if (nota>10) {

        return "Excelente" ;
    }
    else{
        return "Bom" ;
    }
}
    public static String nota3() {
        int nota = 16;
        if (nota > 15) {

            return "Você é Fodão";
        } else {
            return "Bom";
        }

    }
    public static String nome2() {
        int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog("digite a nota para a garota")) ;
        if (numero>=5 ) {

            return "Linda: " + (numero);
        } 
        else {
            return "Feia: " + (numero);
        }
 
    }

    
        
    }

