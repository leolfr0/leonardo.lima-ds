import java.util.Scanner;
public class Lista10_5
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira uma frase.");
        String frase=sc1.nextLine();
        
        String[] palavras=frase.split(" ");
        
        System.out.print("A frase digitada tem "+palavras.length+" palavras.");
        
	}
}
