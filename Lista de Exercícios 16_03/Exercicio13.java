import java.util.Scanner;
public class Exercicio13
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o peso em kg.");
        double peso=sc1.nextDouble();
        
        System.out.println("Insira a altura em metros.");
        double altura=sc1.nextDouble();
        
        double imc=peso/(altura*altura);
        
        if (imc<18.5){
            System.out.println("Abaixo do peso.");
        }
        else if(imc<29.9){
            System.out.println("Peso normal.");
        }
        else{
            System.out.println("Acima do peso.");
        }
        
	}
}
