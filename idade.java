import java.util.Scanner;

class idade {
    public static void main(String[] args) {
    float idade;
    String nome;
    Scanner leia = new Scanner(System.in);
    System.out.print(" Informe seu nome: ");
    nome =leia.nextLine();
    System.out.print("Informe sua idade: ");
    idade = leia.nextFloat();
    if (idade >=0 && idade<=11) {
        System.out.print(" Voce é uma criança, sua idade é: " + idade +  " anos. ");    
    }
    else if (idade>=12 && idade<=17) {
        System.out.print(" Voce é um adolescente, sua idade é: " + idade +  " anos.");
    }
    else if (idade >=18 && idade<=64) {
        System.out.println(" Voce é um adulto, sua idade é: " + idade +  " anos. ");
    }
    else {
        System.out.print(" Voce é um idoso, sua idade é:"  + idade +  " anos. ");
    }
    }
}