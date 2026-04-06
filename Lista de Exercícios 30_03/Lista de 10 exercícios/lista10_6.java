import java.util.Scanner;

public class lista10_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do array:");
        int tamanho = sc.nextInt();
        
        int[] arr = new int[tamanho];
        int[] par = new int[tamanho];
        int[] impar = new int[tamanho];
        
        int contPar = 0;
        int contImpar = 0;
        
        for (int i = 0; i < tamanho; i++){
            System.out.println("Digite o " + i + "º número:");
            arr[i] = sc.nextInt();
        
            if(arr[i] % 2 == 0){
                par[contPar] = arr[i];
                contPar++;
            } else {
                impar[contImpar] = arr[i];
                contImpar++;
            }
        }
        
        System.out.print("Números pares: ");
        for (int i = 0; i < contPar; i++){
            System.out.print(par[i] + ", ");
        }
        
        System.out.print("\nNúmeros ímpares: ");
        for (int i = 0; i < contImpar; i++){
            System.out.print(impar[i] + ", ");
        }
        
        sc.close();
    }
}