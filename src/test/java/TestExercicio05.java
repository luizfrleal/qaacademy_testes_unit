import EasyRefatoracao.Exercicio05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestExercicio05 {

    Exercicio05 exercicio05 = new Exercicio05();

    @Test
    public void testeSoma() {
       
        assertEquals(12, exercicio05.soma(2, 7, 3));

    }

    @Test
    public void testeSubitracao() {

        assertEquals(3, exercicio05.subitracao(6, 1, 2));
        
    }

    @Test
    public void testeMultiplicacao() {

        assertEquals(125, exercicio05.multiplicacao(5, 5, 5));
        
    }
    @Test
    public void testeMedia() {

        assertEquals(3, exercicio05.media(3, 3, 3));
        
    }
}
