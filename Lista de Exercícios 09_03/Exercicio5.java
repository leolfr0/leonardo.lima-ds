import java.util.Scanner;
public class Exercicio5
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Informe o salario.");
        double salario=sc1.nextDouble();
        
        if (salario<2000){
            double adicional=salario*0.1;
            salario=salario+adicional;
        }
        else if (salario<4000){
            double adicional=salario*0.07;
            salario=salario+adicional;
        }
        else{
            double adicional=salario*0.05;
            salario=salario+adicional;
        }
        
        System.out.println("O salario final e: R$"+salario);
        
	}
}
