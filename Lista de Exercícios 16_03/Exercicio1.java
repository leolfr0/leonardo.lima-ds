import java.util.Scanner;
public class Exercicio1
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um número.");
        double num=sc1.nextDouble();
        
        System.out.println("O dobro do número inserido é "+num*2+" e o seu triplo é "+num*3);
	}
}
