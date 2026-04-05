import java.util.Scanner;
public class Lista20_11
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a idade.");
        int idade=sc1.nextInt();
        
        if (idade<18){
            System.out.println("Menor de idade.");
        }
        else{
            System.out.println("Maior de idade.");
        }
        
	}
}
