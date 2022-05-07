package MediumRefatoracao;

public class ExecExercicio07 {
    public static void main(String[] args) {
        Exercicio07 exercicio07 = new Exercicio07();
        exibirVetor(exercicio07.preencheVetorMeses());

    }

    public static void exibirVetor(String[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }
}
