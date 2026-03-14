import java.util.Scanner;
public class Exercicio7
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a temperatura em graus celsius.");
        double grausCelsius=sc1.nextDouble();
        
        double grausFahrenheit=(grausCelsius*1.8)+32;
        System.out.println("A temperatura em Fahrenheit é: "+grausFahrenheit);
        
	}
}
