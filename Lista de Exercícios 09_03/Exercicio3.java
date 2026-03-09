import java.util.Scanner;
public class Exercicio3
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um numero.");
        int num=sc1.nextInt();
        
        if(num>=1){
            System.out.println("O numero e positivo.");
        }
        else if(num<0){
            System.out.println("O numero e negativo.");
        }
        else{
            System.out.println("O numero e igual a zero.");
        }
	}
}
