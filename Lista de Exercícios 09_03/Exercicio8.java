import java.util.Scanner;
public class Exercicio8
{
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Insira o valor do produto.");
		double valProduto=sc1.nextDouble();
		
		double desconto;
		if (valProduto>100){
		    desconto=valProduto*0.2;
		    valProduto=valProduto-desconto;
		}
		else{
		    desconto=valProduto*0.1;
		    valProduto=valProduto-desconto;
		}
		System.out.println("O valor do desconto foi de "+desconto+" e o valor final é "+valProduto);
		
	}
}
