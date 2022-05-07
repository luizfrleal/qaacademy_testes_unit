package EasyRefatoracao;



public class Exercicio06 {

    public String verificaAprovacao(double nota1, double nota2) {

        double media;

        media = (nota1 + nota2) / 2;

        if (media > 5) {
            return ("Aprovado " + media);
        }

        if (media < 5) {
            return ("Reprovado " +  media);
        }

        if (media == 5) {
            return ("Exame " + media );
        }
        return "";
    }

}
