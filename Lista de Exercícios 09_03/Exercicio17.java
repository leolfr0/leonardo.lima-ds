import java.util.Scanner;
public class Exercicio17
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a nota.");
        double nota=sc1.nextDouble();
        
        System.out.println("Insira a frequência.");
        double freq=sc1.nextDouble();
        
        if(nota>=7 && freq>=75){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
        
	}
}
