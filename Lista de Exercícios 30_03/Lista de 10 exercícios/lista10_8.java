import java.util.Random;
import java.util.Scanner;

public class lista10_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(11);
        boolean ganhou = false;
        System.out.println("Tente divinhar o número de 0 a 10: ");
        int numeroU = sc.nextInt();
        
        while(ganhou == false){
            if(numeroU < numero){
                System.out.println("O número secreto é maior que o digitado!");
                System.out.println("Tente novamente:");
                numeroU = sc.nextInt();
            }
            else if (numeroU > numero){
                System.out.println("O número secreto é menor que o digitado!");
                System.out.println("Tente novamente:");
                numeroU = sc.nextInt();
            }else{
                System.out.println("Você acertou!");
                ganhou = true;
            }
        }
    }
}
