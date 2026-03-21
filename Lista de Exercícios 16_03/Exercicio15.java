import java.util.Scanner;
public class Exercicio15
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o preço.");
        double preco=sc1.nextDouble();
        
        if (preco<50){
            preco=preco-(preco*0.05);
        }
        else if(preco<=100){
            preco=preco-(preco*0.1);
        }
        else {
            preco=preco-(preco*0.15);
        }
        
        System.out.println("O valor final é de "+preco);
        
	}
}
