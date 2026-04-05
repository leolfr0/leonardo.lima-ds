import java.util.Scanner;
public class Lista20_7
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Insira um número");
        int inp=sc1.nextInt();
        
        for(int i=0;i<=inp;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        
        
	}
}
