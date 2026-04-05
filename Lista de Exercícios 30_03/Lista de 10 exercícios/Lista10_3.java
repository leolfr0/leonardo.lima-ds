import java.util.Scanner;
public class Lista10_3
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        int senha=1234;
        
        System.out.println("Digite a senha.");
        int inp=sc1.nextInt();
        
        int cont=2;
        if (inp!=senha){
            while (cont!=0){
                System.out.println("Senha incorreta, você tem mais "+cont+" tentativas.");
                inp=sc1.nextInt();
                cont--;
                if (inp==senha){
                    cont=0;
                    System.out.println("Senha Correta.");
                }
            }
        }
        else{
            System.out.println("Senha Correta.");
        }
        
	}
}
