package EasyRefatoracao;

public class Exercicio09Flavio {


        public int[] calcularTabuada(int numeroDigitado) {
    
            int[] vetorTabuada = new int[10];
            int i = 1;
            while (i <= 10) {
                vetorTabuada[i-1] = numeroDigitado * i;
                i++;
            }
            return vetorTabuada;
        }
    
    
    
    }

