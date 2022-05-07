package Medium;

public class Exercicio04 {
    public static void main(String[] args) {

        int multiplicacao = 1, i = 1;

        while (i <= 1000) {
            multiplicacao = multiplicacao * i;

            if (multiplicacao >= 1000) {

                multiplicacao = 1;
            }

            System.out.println(multiplicacao);
            i++;
        }

    }

}
