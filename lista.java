import java.util.Scanner;


public class lista {
    public static void main(String[] args) {
        float soma, valor1, valor2, valor3, valor4, valor5, valor6, valor7, valor8, valor9, valor10;
           String nome, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10;
         Scanner ler = new Scanner(System.in);
   
          System.out.print("Informe seu nome: ");
          nome = ler.nextLine();
          System.out.print("Informe item 1: ");
          item1 =  ler.nextLine();
          System.out.print("Informe valor do item 1: ");
          valor1 = ler.nextFloat();
          System.out.print("Informe item 2: ");
          item2 =  ler.next();
          System.out.print("Informe valor do item 2: ");
          valor2 = ler.nextFloat();
          System.out.print("Informe item 3: ");
          item3 =  ler.next();
          System.out.print("Informe valor do item 3: ");
          valor3 = ler.nextFloat();
          System.out.print("Informe item 4: ");
          item4 =  ler.next();
          System.out.print("Informe valor do item 4: ");
          valor4 = ler.nextFloat();
          System.out.print("Informe item 5: ");
          item5 =  ler.next();
          System.out.print("Informe valor do item 5: ");
          valor5 = ler.nextFloat();
          System.out.print("Informe item 6: ");
          item6 =  ler.next();
          System.out.print("Informe valor do item 6: ");
          valor6 = ler.nextFloat();
          System.out.print("Informe item 7: ");
          item7 =  ler.next();
          System.out.print("Informe valor do item 7: ");
          valor7 = ler.nextFloat();
          System.out.print("Informe item 8: ");
          item8 =  ler.next();
          System.out.print("Informe valor do item 8: ");
          valor8 = ler.nextFloat();
          System.out.print("Informe item 9: ");
          item9 =  ler.next();
          System.out.print("Informe valor do item 9: ");
          valor9 = ler.nextFloat();
          System.out.print("Informe item 10: ");
          item10 =  ler.next();
          System.out.print("Informe valor do item 10: ");
          valor10 = ler.nextFloat();
          soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9 + valor10;
          System.out.println("o nome do comprador é: " + nome);
          System.out.println("o valor total é: " + soma);
          System.out.println("======================");
          System.out.println("      COMPRAS ");
          System.out.println("======================");
          System.out.println(" produtos:  " + item1 + " , " + item2 + " , " + item3 + " , " + item4 + "  ," + item5 + " , " + item6 + " , " + item7 + " , " + item8 + " , " + item9 + " , " + item10 + " . ");
        }  
    }

