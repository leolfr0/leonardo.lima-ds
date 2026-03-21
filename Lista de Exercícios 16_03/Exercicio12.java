import java.util.Scanner;
public class Exercicio12
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o valor em R$.");
        double reais=sc1.nextDouble();
        
        System.out.println("Insira a cotação do dólar.");
        double cotacao=sc1.nextDouble();
        
        double dolar=reais/cotacao;
        
        System.out.println("Você pode comprar US$"+dolar);
        
	}
}
