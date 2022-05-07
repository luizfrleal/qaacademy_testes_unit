package Metodos;

import java.security.PublicKey;

public class Exercicio5MetodosComParametrosComRetorno {
    public static void main(String[] args) {
        System.out.println("Valor da Libra Comercial: "   + valorlibraC(6.61));
        System.out.println("Valor da Libra Turismo: " + valorlibraT(6.95));
        System.out.println("Valor da Dolar Turismo: " + valordolarT(5.25));
        System.out.println("Valor da Dolar Comercial: " + valordolarC(5.25));
        System.out.println("Valor do Real : " + Real(1.00));
    }

    public static double Real(double valorreal) {
        return valorreal;
    }

    public static double valorlibraC(Double comercial) {

        return comercial;
    }

    public static double valorlibraT(Double turismo) {

        return turismo;
    }

    public static double valordolarT(Double dolarTurismo) {

        return dolarTurismo;
    }

    public static double valordolarC(Double dolarComercial) {

        return dolarComercial;
    }

}
