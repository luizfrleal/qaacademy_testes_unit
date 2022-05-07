package MediumRefatoracao;

public class ExecExercicio04 {
    public static void main(String[] args) {
        Exercicio04 exercicio04 = new Exercicio04();
        exibirVetor(exercicio04.multiplicaAteMil());

}

public static void exibirVetor(int[] vetorParaImprimir) {
    int i = 0;
    while (i < vetorParaImprimir.length) {
        System.out.println(vetorParaImprimir[i]);
        i++;
    }
    
}
}