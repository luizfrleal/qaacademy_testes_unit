package MediumRefatoracao;

public class Exercicio03 {

    public int somarAteMil(){
        int soma=0, i=1;

        while (i<=1000 ) {
            soma = soma + i;
            if (soma>=1500) {
                break;
            }
		
        i++;
}

return soma;

}
}


// public static void main(String[] args) {
//     int soma=0, i=1;

// while (i<=1000 && soma<1500) {
     
//     System.out.println(soma); 
    
//     soma = soma + i;
//     i++;