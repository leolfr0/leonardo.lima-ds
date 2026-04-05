import java.util.Scanner;
public class Lista10_2
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o CPF.");
        String cpf=sc1.nextLine();
        
        if (cpf.length()==11 || cpf.length()==14){
            System.out.println("CPF Válido.");
        }
        else{
            System.out.println("CPF Inválido.");
        }
        
	}
}
