import java.util.Scanner;
public class Exercicio14
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a primeira nota.");
        double nota1=sc1.nextDouble();
        
        System.out.println("Insira a segunda nota.");
        double nota2=sc1.nextDouble();
        
        double media=(nota1+nota2)/2;
        
        if (media>=6){
            System.out.println("Aprovado.");
        }
        else{
            System.out.println("Reprovado.");
        }
        
	}
}
