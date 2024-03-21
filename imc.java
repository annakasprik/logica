import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        float peso, altura, imc;
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        nome= ler.nextLine();
        System.out.print("Informe seu peso: ");
        peso= ler.nextFloat();
        System.out.print("Informe sua altura: ");
        altura= ler.nextFloat();
        imc = peso/(altura*altura);
        if (imc<=18) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é MAGREZA! Vai comer espinafre!" );
        }
        else if (imc>=18.5 && imc<=24.9) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é SAUDAVÉL! Arrasou!" );  
        }
        else if (imc>=25 && imc<=29.9) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é SOBREPESO! Vai caminhar!" );  
        }
        else if (imc>=30 && imc<=34.9) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é OBESIDADE I! Cuidado!" );  
        }
        else if (imc>=35 && imc<=39.9) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é OBESIDAE II! Tá morrendo aos poucos né!" );  
        }
        else if (imc>=40) {
            System.out.print("O imc de " + nome +" é "+ imc +" sua classificação é OBESIDADE III! Prepara o caixão!" );  
        }


    }
}
