import java.util.Scanner;
public class media {
public static void main(String[] args) {
    float n1, n2, n3, n4, media;
    String nome;
    Scanner leia = new Scanner(System.in);
    System.out.print(" Informe seu nome: ");
    nome =leia.nextLine();
    System.out.print("Informe a primeira nota: ");
    n1 = leia.nextFloat();
    System.out.print("Informe sua segunda nota: ");
    n2 = leia.nextFloat();
    System.out.print("Informe sua terceira nota: ");
    n3 = leia.nextFloat();
    System.out.print("Informe sua quarta nota: ");
    n4 = leia.nextFloat();
    media =(n1+n2+n3+n4) / 4;
     
    if (media >=6) {
        System.out.print(" Aluno(a) " + nome + " está aprovado(a), com a média " + media + " Parabéns!");
    }
    else if (media>=4 && media<6) {
        System.out.print(" Aluno(a) " + nome + " está em recuperação, com a média " + media + " Que pena,estude mais!");
    }
    else{
        System.out.print(" Aluno(a) " + nome + " está reprovado(a), com a média " + media + " Prepara o lombo que vem chinelada!");
    }
}  
}


