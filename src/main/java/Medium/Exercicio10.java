package Medium;

public class Exercicio10 {
    public static void main(String[] args) {
        int i=2;
      
        int[] vetorFib;
        vetorFib = new int[10];

vetorFib[0]=0;
vetorFib[1]=1;

while (i<=9) {

vetorFib[i]= vetorFib[i-1] +vetorFib[i-2];


i++;
}

i=0;


while (i<=9) {
System.out.println(vetorFib[i]); 
i++;
}
    }

}
