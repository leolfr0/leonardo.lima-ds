import java.util.Scanner;
public class Exercicio15
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a idade.");
        int idade=sc1.nextInt();
        
        if (idade>0 && idade<=12){
            System.out.println("Criança");
        }
        else if (idade>=13 && idade<=17){
            System.out.println("Adolescente");
        }
        else if (idade>=18 && idade<=59){
            System.out.println("Adulto");
        }
        else if (idade>=60){
            System.out.println("Idoso");
        }
        
        
	}
}
