import java.util.Scanner;
public class Exercicio20
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o primeiro lado do triângulo.");
        double lado1=sc1.nextDouble();
        System.out.println("Insira o segundo lado do triângulo.");
        double lado2=sc1.nextDouble();
        System.out.println("Insira o terceiro lado do triângulo.");
        double lado3=sc1.nextDouble();
        
        if (lado1==lado2 && lado2==lado3){
            System.out.println("O triângulo é equilátero.");
        }
        else if (lado1==lado2 || lado2==lado3 || lado3==lado1){
            System.out.println("O triângulo é isóceles.");
        }
        else{
            System.out.println("O triângulo é escaleno.");
        }
        
        
	}
}
