import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EasyRefatoracao.Exercicio08;

public class TesteWxercicio08 {

    Exercicio08 exercicio08 = new Exercicio08();

    @Test
    public void valorImpostoFaixa01() {
        assertEquals("Valor salário Bruto: 1900.5" + "\n" +
                "Imposto: Isento ", exercicio08.calculoImpos(1900.50));
    }

    @Test
    public void valorImpostoFaixa02() {
        assertEquals("Valor Salário Bruto: 2819.84" + "\n" + "Valor Salário Liquido: 2751.152" + "\n" +
                "Valor Imposto de Renda: 68.68799999999999", exercicio08.calculoImpos(2819.84));

    }
    @Test
    public void valorImpostoFaixa03() {
        assertEquals("Valor Salário Bruto: 3375.0" + "\n" + "Valor Salário Liquido: 3223.55" + "\n" +
                "Valor Imposto de Renda: 151.45", exercicio08.calculoImpos(3375.0));

    }
    @Test
    public void valorImpostoFaixa04() {
        assertEquals("Valor Salário Bruto: 4500.0" + "\n" + "Valor Salário Liquido: 4123.63" + "\n" +
                "Valor Imposto de Renda: 376.37", exercicio08.calculoImpos(4500.0));

    }

    @Test
    public void valorImpostoFaixa05() {
        assertEquals("Valor Salário Bruto: 8000.0" + "\n" + "Valor Salário Liquido: 6669.360000000001" + "\n" +
                "Valor Imposto de Renda: 1330.6399999999999", exercicio08.calculoImpos(8000.0));

    }
}
