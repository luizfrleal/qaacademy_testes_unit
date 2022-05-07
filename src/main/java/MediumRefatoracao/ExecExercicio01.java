package MediumRefatoracao;

public class ExecExercicio01 {
    
    public static void main(String[] args) {
        
        Exercicio01 exercicio01 = new Exercicio01(); 
        String [] vetorParImpar = exercicio01.verificarNumerosParImpar(); 
        exibirVetor(vetorParImpar);
        exibirVetor(exercicio01.verificarNumerosParImpar());


       
    }

    public static void exibirVetor(int[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }

    public static void exibirVetor(String[] vetorParaImprimir) {
        int i = 0;
        while (i < vetorParaImprimir.length) {
            System.out.println(vetorParaImprimir[i]);
            i++;
        }
    }
}


    

