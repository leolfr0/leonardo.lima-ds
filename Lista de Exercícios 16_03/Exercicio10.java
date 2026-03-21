import java.util.Scanner;
public class Exercicio10
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o primeiro número.");
        int num1=sc1.nextInt();
        
        System.out.println("Insira o segundo número.");
        int num2=sc1.nextInt();
        
        int diferenca=0;
        if (num1<num2){
            diferenca=num2-num1;
        }
        else{
            diferenca=num1-num2;
        }
        
        System.out.println("A diferença dos números é "+diferenca);
	}
}
