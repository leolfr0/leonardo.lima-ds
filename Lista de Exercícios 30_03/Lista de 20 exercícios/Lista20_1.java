import java.util.Scanner;
public class Lista20_1
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um número.");
        int num=sc1.nextInt();
        
        int cont=0;
        while(cont<num){
            System.out.println(cont);
            cont++;
        }
        
	}
}
