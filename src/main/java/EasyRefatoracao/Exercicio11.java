package EasyRefatoracao;

public class Exercicio11 {

    public int calculoSoma(int numero) {

        int soma, i = 1;
        soma = numero;

        while (i <= 100) {

            soma = (soma + 2);
            i = i + 1;
            
        }
        return  + soma;
    }
    public int[] somarDoisComVetor(int numeroDigitado) {
        int[] vetorSoma = new int[100];

        int i = 1;
        while (i <= 100) {
            numeroDigitado = numeroDigitado + 2;
            vetorSoma[i - 1] = numeroDigitado;
            i++; // i = i +1;
        }
        return vetorSoma;

    }

}
