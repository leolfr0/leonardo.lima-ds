import java.util.Scanner;
public class Exercicio19
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        double[] numeros;
        numeros= new double[3];
        int i=0;
        while (i<3){
            System.out.println("Insira o número "+(i+1));
            numeros[i]=sc1.nextDouble();
            i++;
        }
        i=0;
        double menor=99999999;
        while (i<3){
            if (numeros[i]<menor){
                menor=numeros[i];
            }
            i++;
        }
        System.out.println("O maior número é "+menor);

	}
}
