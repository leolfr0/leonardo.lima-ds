import java.util.Scanner;
public class Exercicio2
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero.");
        int num1=sc1.nextInt();
        
        System.out.println("Insira o segundo numero.");
        int num2=sc1.nextInt();
        
        if(num1>num2){
            System.out.println("O primeiro numero, "+num1+" e maior que o segundo, "+num2+".");
        }
        else if (num2>num1){
            System.out.println("O sengundo numero, "+num2+" e maior que o primeiro, "+num1+".");
        }  
        else{
            System.out.println("Os numeros sao iguais.");
        }
        
	}
}
