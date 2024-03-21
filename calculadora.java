import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        float n1, n2, soma, subt, mult, div, escolha;
        Scanner leia = new Scanner(System.in);
        Scanner leiaNumero = new Scanner(System.in);
        System.out.print(" Escola o o n1: ");
        n1 = leia.nextFloat();
        System.out.print(" Escola o o n2: ");
        n2 = leia.nextFloat();
        System.out.println("OPERAÇÕES");
        System.out.println(" \n[soma=1] \n[subtração=2] \n[multiplicação=3] \n[divisão=4] ");
        System.out.print("Escolha: ");
        escolha = leia.nextFloat();

        soma = n1+n2;
        subt = n1-n2;
        mult = n1*n2;
        div = n1/n2;

        if (escolha == 1) {
             System.out.print("A soma entre " +n1+ "+" +n2+"é: " + (n1+n2));
        }
        else if (escolha == 2) {
            System.out.print("A subtração entre " +n1+ "-"+n2+" é: " + (n1-n2));
        }
        else if (escolha == 3) {
            System.out.print("A multiplicação entre " +n1+ "*"+n2+" é: " + (n1*n2));
        }
        else {
            System.out.print("A divisão entre " + n1 + " / " +n2+" é: "+ (n1/n2));
        }
    }
}
