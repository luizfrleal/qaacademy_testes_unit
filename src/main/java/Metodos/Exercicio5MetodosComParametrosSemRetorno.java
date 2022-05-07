package Metodos;

public class Exercicio5MetodosComParametrosSemRetorno {
    

    public static void main(String[] args) {
        notas(5, 19);
        sobrenome("Leal", "Rodrigues");
        salario(1999.51, 8659.99);
        carro("Audi A3", "Sandero");
        moto("CB600", "CG125");

        
    }

public static void notas( int nota01, int nota02) {
    System.out.println(nota01);
    System.out.println(nota02);
}
public static void sobrenome( String sobreNome01, String sobreNome02) {
    System.out.println(sobreNome01);
    System.out.println(sobreNome02);
}

public static void salario( Double salario01, Double salario02) {
    System.out.println(salario01);
    System.out.println(salario02);
}

public static void carro( String carro01, String carro02) {
    System.out.println("Seu carro é um: " + carro01);
    System.out.println("Seu carro é um: " + carro02);
}

public static void moto( String moto01, String moto02) {
    System.out.println("Sua moto é um: " + moto01);
    System.out.println("Sua moto é um: " + moto01);
}

}