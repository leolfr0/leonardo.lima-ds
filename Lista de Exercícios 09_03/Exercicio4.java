import java.util.Scanner;
public class Exercicio4
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira a primeira nota.");
        double nota1=sc1.nextDouble();
        
        System.out.println("Insira a segunda nota.");
        double nota2=sc1.nextDouble();
        
        System.out.println("Insira a terceira nota.");
        double nota3=sc1.nextDouble();
        
        double media=nota1+nota2+nota3;
        media=media/3;
        
        if (media>=7){
            System.out.println("O aluno esta aprovado.");
        }
        else if (media >=5){
            System.out.println("o aluno esta de recuperacao.");
        }
        else{
            System.out.println("O aluno esta reprovado.");
        }
        
	}
}
