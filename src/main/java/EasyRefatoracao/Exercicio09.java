package EasyRefatoracao;

public class Exercicio09 {

    public String calcularTabuada(int numero){
        int resultado, i = 1; 
        int vetorTabada[] = new int [10];
        
        if (numero >= 1 && numero <= 10) {

            while (i <= 10){

                resultado = numero * i;
                

                System.out.println(numero +  " x "  + i + " = " + resultado);
            i++;
            }
    }
    
    return "" ;
    

    }
}