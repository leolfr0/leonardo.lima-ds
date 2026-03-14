import java.util.Scanner;
public class Exercicio6
{
	public static void main(String[] args) {
		System.out.println("Insira a idade.");
		Scanner sc1=new Scanner(System.in);
		
		int idade=sc1.nextInt();
		if (idade<16){
		    System.out.println("Você não pode votar ainda.");
		}
		else if (idade<18){
		    System.out.println("O voto é opcional.");
		}
		else{
		    System.out.println("O voto é obrigatório.");
		}
	}
}
