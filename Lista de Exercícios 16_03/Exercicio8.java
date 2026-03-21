import java.util.Scanner;
public class Exercicio8
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o salário.");
        double salario=sc1.nextDouble();
        
        System.out.println("Insira o valor da parcela.");
        double parcela=sc1.nextDouble();
        
        double limite = salario*0.3;
        
        if(parcela<=limite){
            System.out.println("Empréstimo aprovado.");
        }
        else{
            System.out.println("Empréstimo não aprovado.");
        }
        
	}
}
