import java.util.Scanner;
public class Exercicio14
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Insira a distância a ser percorrida. (Km)");
        double km=sc1.nextDouble();
        
        System.out.println("Insira o consumo do carro. (Km/L)");
        double consumo=sc1.nextDouble();
        
        double litrosGastos=km/consumo;
        System.out.println("A quantidade de litros que serão gastos é de "+litrosGastos);
        
        
	}
}
