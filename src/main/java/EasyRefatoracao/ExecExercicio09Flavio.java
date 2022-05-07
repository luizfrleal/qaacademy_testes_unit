package EasyRefatoracao;

public class ExecExercicio09Flavio {
    public static void main(String[] args) {
        

        Exercicio09Flavio exercicio09Flavio = new Exercicio09Flavio();
        int[] vetorTabuada = exercicio09Flavio.calcularTabuada(10);
        exibirVetor(vetorTabuada);
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }
}
    