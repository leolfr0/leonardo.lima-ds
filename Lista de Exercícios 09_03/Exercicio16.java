import java.util.Scanner;
public class Exercicio16
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira o usuário.");
        String usuario=sc1.nextLine();
        
        System.out.println("Insira a senha.");
        int senha=sc1.nextInt();
        
        if (senha==1234 && usuario.equals("admin")){
            System.out.println("ACESSO PERMITIDO");
        }
        else{
            System.out.println("ACESSO NEGADO");
        }
        
	}
}
