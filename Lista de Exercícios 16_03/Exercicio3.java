import java.util.Scanner;
public class Exercicio3
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a primeira nota.");
        double nota1=sc1.nextDouble();
        
        System.out.println("Insira o peso da primeira nota.");
        double pesoNota1=sc1.nextDouble();
        
        System.out.println("Insira a segunda nota.");
        double nota2=sc1.nextDouble();
        
        System.out.println("Insira o peso da segunda nota.");
        double pesoNota2=sc1.nextDouble();
        
        System.out.println("Insira a terceira nota.");
        double nota3=sc1.nextDouble();
        
        System.out.println("Insira o peso da terceira nota.");
        double pesoNota3=sc1.nextDouble();
        
        nota1=nota1*pesoNota1;
        nota2=nota2*pesoNota2;
        nota3=nota3*pesoNota3;
        
        double media=(nota1+nota2+nota3)/(pesoNota1+pesoNota2+pesoNota3);
        
        System.out.println("A média ponderada dessas notas é "+media);
        
	}
}
