import java.util.Scanner;
public class Exercicio10
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a altura em metros.");
        double altura=sc1.nextDouble();
        
        System.out.println("Insira o sexo.\n1-MASCULINO \n2-FEMININO");
        int sexo=sc1.nextInt();
        
        if (sexo==1){
            double pesoIdeal=(72.7*altura)-58;
            System.out.println("O seu peso ideal é "+pesoIdeal);
        }
        else if (sexo==2){
            double pesoIdeal=(62.1*altura)-44.7;
            System.out.println("O seu peso ideal é "+pesoIdeal);
        }
        else{
            System.out.println("Opção inválida.");
        }
        
        
	}
}
