import java.util.Scanner;
public class Exercicio9
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira o primeiro número.");
        double num1=sc1.nextDouble();
        System.out.println("Insira o segundo número.");
        double num2=sc1.nextDouble();
        
        if (num1%num2==0){
            System.out.println("O primeiro é múltiplo do segundo.");
        }
        else{
            System.out.println("O primeiro não é múltiplo do segundo.");
        }
        
        
	}
}
