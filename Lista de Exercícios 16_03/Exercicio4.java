import java.util.Scanner;
public class Exercicio4
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o preço do produto.");
        double preco=sc1.nextDouble();
        
        double precoFinal=preco+(preco*0.05)+(preco*0.07);
        
        System.out.println("O preço final do produto após impostos é "+precoFinal);
        
	}
}
