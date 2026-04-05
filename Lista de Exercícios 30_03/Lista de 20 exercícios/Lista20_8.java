import java.util.Scanner;
public class Lista20_8
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        int senha=1234;
        System.out.println("Insira a senha");
        int inp=sc1.nextInt();
        
        if (inp==senha){
            System.out.println("Senha correta.");
        }
        else{
            System.out.println("Senha incorreta.");
        }
        
	}
}
