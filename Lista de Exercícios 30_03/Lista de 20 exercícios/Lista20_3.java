import java.util.Scanner;
public class Lista20_3
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um número.");
        double inp=sc1.nextDouble();
        
        
        double cont=inp;
        while (inp!=0){
            System.out.println("Digite um número.");
            inp=sc1.nextDouble();
            cont+=inp;
            System.out.println(cont);
        }
        
	}
}
