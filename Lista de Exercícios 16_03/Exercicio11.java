import java.util.Scanner;
public class Exercicio11
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira o primeiro número.");
        double num1=sc1.nextDouble();
        System.out.println("Insira o segundo número.");
        double num2=sc1.nextDouble();
        System.out.println("Insira o terceiro número.");
        double num3=sc1.nextDouble();
        
        double menor=0;
        double maior=0;
        double meio=0;
        
        if (num1<num2 && num1<num3){
            menor=num1;
            if(num2<num3){
                meio=num2;
                maior=num3;
            }
            else{
                meio=num3;
                maior=num2;
            }
        }
        else if(num2<num3 && num2<num1){
            menor=num2;
            if(num3<num1){
                meio=num3;
                maior=num1;
            }
            else{
                meio=num1;
                maior=num3;
            }
        }
        else if(num3<num2 && num3<num1){
            menor=num3;
            if(num2<num1){
                meio=num2;
                maior=num1;
            }
            else{
                meio=num1;
                maior=num2;
            }
        }
        
        System.out.println(menor+" "+meio+" "+maior);
	}
}
