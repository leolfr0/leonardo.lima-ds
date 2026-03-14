import java.util.Scanner;
public class Exercicio12
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o primeiro número.");
        double num1=sc1.nextDouble();
        
        System.out.println("Insira o segundo número.");
        double num2=sc1.nextDouble();
        
        System.out.println("Insira a operação desejada. \n1-ADIÇÃO\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO");
        int opcao=sc1.nextInt();
        
        switch (opcao){
            case 1:
                double resultado=adicao(num1, num2);
                System.out.println("O resultado da sua operação é: "+resultado);
                break;
            case 2:
                resultado=subtracao(num1, num2);
                System.out.println("O resultado da sua operação é: "+resultado);
                break;
            case 3:
                resultado=multiplicacao(num1, num2);
                System.out.println("O resultado da sua operação é: "+resultado);
                break;
            case 4:
                resultado=divisao(num1, num2);
                System.out.println("O resultado da sua operação é: "+resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
	}
	public static double adicao(double num1, double num2){
	    double resultado=num1+num2;
	    return resultado;
	}
	public static double multiplicacao(double num1, double num2){
	    double resultado=num1*num2;
	    return resultado;
	}
	public static double subtracao(double num1, double num2){
	    double resultado=num1-num2;
	    return resultado;
	}
	public static double divisao(double num1, double num2){
	    double resultado=num1/num2;
	    return resultado;
	}
}
