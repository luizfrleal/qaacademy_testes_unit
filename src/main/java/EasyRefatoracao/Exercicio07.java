package EasyRefatoracao;

public class Exercicio07 {

public String valorSalario (double salario) {

    double valorInss;

if (salario <= 1045.00){
 

valorInss = salario*0.075; 
return "INSS " + valorInss;

}

if (salario >= 1045.01 && salario <= 2089.60){
 
    
    valorInss = salario*0.09; 
    return "INSS " + valorInss;

}


if ((salario >= 2089.61 && salario <= 3134.40)) {

    valorInss = salario*0.12; 
    return "INSS " + valorInss;

}
 
if ((salario >= 3134.41 && salario <= 6101.06)) {

    valorInss = salario*0.14; 
    return "INSS " + valorInss;

}
    
if ((salario > 6101.06)) {

    valorInss = (854.15);
    return "INSS " + valorInss;
}
return ""; 
}
}
