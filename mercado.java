import java.util.Scanner;

public class mercado {
public static void main(String[] args) {
    String nome, produtos;
    float valorProduto, nota;
    int qtdproduto, totalItens;
    Scanner leia = new Scanner(System.in);
    System.out.println("Infome seu nome:");
    nome = leia.nextLine();
     int i = 0;
    do {


        System.out.println("Informe nome do produto: ");
        produtos = leia.nextLine();
        System.out.println("Informe o valor do produto: ");
        valorProduto = leia.nextFloat();
        System.out.println("Informe a quantidade desejada: ");
        qtdproduto = leia.nextInt();
        i ++;
         nome = leia.nextLine();


    } while (i <=11);
    totalItens = qtdproduto + qtdproduto;
    nota = valorProduto * valorProduto;
    System.out.println("Informe nome do cliente:" + nome);
    nome =leia.nextLine();
    System.out.println(nome + " comprou: " + totalItens + " e o valor de sua compra é: " + nota);
    }
}
