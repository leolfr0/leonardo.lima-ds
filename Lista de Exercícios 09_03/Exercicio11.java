import java.util.Scanner;
public class Exercicio11
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira o ano.");
        int ano=sc1.nextInt();
        
        if (ano%4==0 && ano!=1000 && ano!=2000 && ano!=3000){
            System.out.println("O ano é bissexto.");
        }
        else{
            System.out.println("O ano não é bissexto.");
        }
        
	}
}
