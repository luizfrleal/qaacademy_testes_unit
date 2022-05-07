package Easy;
import javax.swing.JOptionPane;

public class Exercicio10 {
    public static void main(String[] args) {

double valorInvestimento, juros=0, totalFinal;
int  i=1;

valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento") ) ;

	while (i<=10){
	
	juros = valorInvestimento * 0.05 + juros ;
	i=i+1;
	
    }
	
	totalFinal= valorInvestimento+juros;
	
	System.out.println("Valor Investido:" +valorInvestimento);
	System.out.println("Valor dos juros ao final de 10 anos é:" +juros);
	System.out.println("Valor Total do investimento com juros é:" +totalFinal);
	
    

    }
}
