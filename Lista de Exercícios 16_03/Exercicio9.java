import java.util.Scanner;
public class Exercicio9
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o salário bruto.");
        double salario=sc1.nextDouble();
        
        if (salario<2000){
            salario=salario-(salario*0.08);
        }
        else if(salario<=3000){
            salario=salario-(salario*0.09);
        }
        else{
            salario=salario-(salario*0.11);
        }
        System.out.println("O salário líquido é de "+salario);
        
	}
}
