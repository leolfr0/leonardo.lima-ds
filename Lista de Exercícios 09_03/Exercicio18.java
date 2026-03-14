import java.util.Scanner;
public class Exercicio18
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a quantidade de kWh utilizados.");
        double kwh=sc1.nextDouble();
        
        double preco;
        if (kwh<100){
            preco=kwh*0.2;
        }
        else{
            preco=kwh*0.25;
        }
        System.out.println("O valor a ser pago é de R$"+preco);
        
	}
}
