import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MediumRefatoracao.Exercicio10;

public class TesteExercicioMedium10 {

    Exercicio10 exercicio10 = new Exercicio10();

    @Test
    public void testeFibonacciSemVetor() {

        assertEquals(34, exercicio10.calcularFibonacci(10));
        
    }

    @Test
    public void testecalcularFibonacciVetor() {
        int[] vetorEsperado = {0,1,1,2,3,5,8,13,21,34};

        assertArrayEquals(vetorEsperado, exercicio10.calcularFibonacciVetor(10));
        
    }
}
