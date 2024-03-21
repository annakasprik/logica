import java.util.Scanner;

public class anoNascimento {
    
    public static void main(String[] args) {
        String nome;
        int dia, mes, ano, anoVida, diasVida;
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.print("Informe seu dia de nascimento: ");
        dia = leia.nextInt();
        System.out.print("Informe seu mês de nascimento: ");
        mes = leia.nextInt();
        System.out.print("Informe ano de nascimento: ");
        ano = leia.nextInt();
       
        if (mes <=3 - ( anoVida = (2024-ano)-1)) {
        
        }
            System.out.println("Você tem " +mes+"" +anoVida+" anos.");
       
        
    
    }
}
