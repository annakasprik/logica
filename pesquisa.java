import java.util.Scanner;

public class pesquisa {
    public static void main(String[] args) { 
    float n1;
    String nome;
    Scanner leia = new Scanner(System.in);
    System.out.print(" Qual seu nome: ");
    nome = leia.nextLine();
    System.out.println(" avalie de 0 a 10: ");
    n1 = leia.nextInt();
    if (n1 <=3) {
        System.out.print (nome + " sua avaliação é: " + n1 + " Péssimo! ");
    }
    else if (n1>=4 && n1<=5) {
        System.out.print(nome + " sua avaliação é: " + n1 + " Ruim! ");
    }
    else if (n1 >=6 && n1<=7) {
        System.out.println(nome + " sua avaliação é: " + n1 + " Bom! ");
    }
    else {
        System.out.print(nome + " sua avaliação é: " + n1 + " Otimo! ");
    }
    }
}