import org.junit.Assert;
import org.junit.Test;

import EasyRefatoracao.Exercicio04;

public class TestExercicio04 {

@Test
    public void testeCalcularODobro() {
     
        
        Exercicio04 exercicio04 = new Exercicio04();

        Assert.assertEquals(12,exercicio04.dobro(6));
    }
}
