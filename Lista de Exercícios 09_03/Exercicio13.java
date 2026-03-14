import java.util.Scanner;
public class Exercicio13
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a nota.");
        double nota=sc1.nextDouble();
        
        if (nota<0 || nota>10){
            System.out.println("NOTA INVÁLIDA");
        }
        else{
            System.out.println("NOTA VÁLIDA");
        }
	}
}
