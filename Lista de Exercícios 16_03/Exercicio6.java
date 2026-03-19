import java.util.Scanner;
public class Exercicio6
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o número.");
        double num=sc1.nextDouble();
        
        boolean par=num%2==0;
        boolean divPor5=num%5==0;
        
        if (par==true && divPor5==false){
            System.out.println("O número é par e não é divisível por 5");
        }
        else if(divPor5==true && par==true){
            System.out.println("O número é par e é divisível por 5");
        }
        else if(par==false && divPor5==true){
            System.out.println("O número é ímpar e é divisível por 5");
        }
        else{
            System.out.println("O número é ímpar e não é divisível por 5");
        }
        
	}
}
