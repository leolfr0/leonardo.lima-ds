import java.util.Scanner;
public class Lista20_16
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um número.");
        double num1=sc1.nextDouble();
        System.out.println("Quantas vezes quer multiplicar esse número?");
        int num2=sc1.nextInt();
        
        int cont=0;
        double mult=0;
        while (cont<num2){
            mult+=num1;
            cont++;
        }
        System.out.println("O resultado da mulltiplicação é:"+mult);
        
	}
}
