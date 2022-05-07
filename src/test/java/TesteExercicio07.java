import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyRefatoracao.Exercicio07;

public class TesteExercicio07 {
    Exercicio07 exercicio07 = new Exercicio07();
    @Test
    public void testeSalarioIsentoFaixa01() {


        assertEquals("INSS 78.375" , exercicio07.valorSalario(1045.00));
    
    }

    @Test
    public void testeSalarioFaixa02() {

        assertEquals("INSS 188.064", exercicio07.valorSalario(2089.60));
        
    }
    @Test
    public void testeSalarioFaixa03() {

        assertEquals("INSS 359.832", exercicio07.valorSalario(2998.60));
    }

    @Test
    public void testeSalarioFaixa04() {

        assertEquals("INSS 854.1400000000001", exercicio07.valorSalario(6101.00));
    }

    @Test
    public void testeSalarioFaixa05() {

        assertEquals("INSS 854.15", exercicio07.valorSalario(500000.00));
    }
}

