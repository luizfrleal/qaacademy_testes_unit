import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyRefatoracao.Exercicio06;

public class TesteExercicio06 {

    Exercicio06 exercicio06 = new Exercicio06();

    @Test
    public void testeAprovacaoAprivado() {

        assertEquals("Aprovado 7.5", exercicio06.verificaAprovacao(7, 8));

    }

    @Test
    public void testeAprovacaoReprovado() {

        assertEquals("Reprovado 3.5", exercicio06.verificaAprovacao(3, 4));

    }

    @Test
    public void testeAprovacaoExame() {

        assertEquals("Exame 5.0", exercicio06.verificaAprovacao(5, 5));

    }

}
