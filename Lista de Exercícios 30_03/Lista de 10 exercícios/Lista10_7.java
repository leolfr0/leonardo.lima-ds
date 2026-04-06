import java.util.Scanner;
public class Lista10_7 /*fiquei bem orgulhoso desse codigo*/
{
	public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int opcao=0;
        boolean ligado=true;
        String[] listaDeCompras=new String[50];
        double[] valorProduto=new double[50];
        int posicaoNaLista=0;
        double valorTotal=0;
        
        while (ligado==true){
            System.out.println("Insira a opção desejada.\n1-ADICIONAR ITEM NA LISTA\n2-FECHAR LISTA");
            opcao=sc1.nextInt();
            sc1.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Qual é o nome do item que deseja adicionar?");
                    listaDeCompras[posicaoNaLista]=sc1.nextLine();
                    System.out.println("Insira o valor do produto.");
                    valorProduto[posicaoNaLista]=sc1.nextDouble();
                    posicaoNaLista++;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                case 2:
                    System.out.println("\nOs itens da lista são:");
                    for (int i=0; i<posicaoNaLista; i++){
                        System.out.println(listaDeCompras[i]+" R$"+valorProduto[i]);
                        valorTotal+=valorProduto[i];
                    }
                    System.out.print("\nO valor total da lista é: "+valorTotal+". Com um total de "+posicaoNaLista+" produtos.");
                    ligado=false;
                    break;
            }
        }
        
	}
}