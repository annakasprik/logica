import java.util.Scanner;

public class media50 {
    
    public static void main(String[] args) {
        String nome;
        float media ;
        int idade; 
        int contador = 0;
        Scanner leia = new Scanner(System.in);
        Scanner leiaIdades = new Scanner(System.in);
        media = 0;
        while (contador <=5) {
            System.out.println("digite seu nome: ");
            nome = leia.nextLine();
            System.out.println("digite seu idade: ");
            idade= leiaIdades.nextInt();
            media += idade;
            contador ++;
        }
        System.out.println(" a media de idade é: " + media/5);

    
    }
}
