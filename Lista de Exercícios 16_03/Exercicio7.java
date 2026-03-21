import java.util.Scanner;
public class Exercicio7
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a distância em km.");
        double distancia=sc1.nextDouble();
        
        System.out.println("Insira a velocidade em média em km/h.");
        double velocidade=sc1.nextDouble();
        
        double tempo=distancia/velocidade;
        System.out.println("O tempo estimado da viagem é "+tempo+" horas.");
        
	}
}
