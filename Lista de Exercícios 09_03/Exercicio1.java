import java.util.Scanner;
public class Exercicio1
{
	public static void main(String[] args) {
	    Scanner sc1=new Scanner(System.in);
		System.out.println("Informe um número inteiro");
		int num=sc1.nextInt();
		
		if(num%2==0){
		    System.out.println("O número é par.");
		}
		else{
		    System.out.println("O número é ímpar.");
		}
		
	}
}
