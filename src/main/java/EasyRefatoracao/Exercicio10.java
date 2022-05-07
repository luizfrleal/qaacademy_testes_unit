package EasyRefatoracao;

public class Exercicio10 {

    public String calculoInvestimento(double valorInvestimento){
        double juros=0, totalFinal;
        int  i=1;


        while (i<=10){
	
            juros = valorInvestimento * 0.05 + juros ;
            i=i+1;
            
            }
            totalFinal= valorInvestimento+juros;

           	
	return "Valor Investido: " +valorInvestimento + "\n" + 
            "Valor dos juros ao final de 10 anos é: " +juros + "\n" +
            "Valor Total do investimento com juros é: " +totalFinal;

	//System.out.println("Valor dos juros ao final de 10 anos é:" +juros);
	//System.out.println("Valor Total do investimento com juros é:" +totalFinal);
	 
    //return "" ; 
    }

}
