import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        /* 'Do While' é uma estrutura que "roda" 
         * ao menos uma vez, ainda que retorne um valor falso. */ 

         Scanner entrada = new Scanner (System.in); 
         String texto = ""; 
         do { 
            System.out.println("Você precisa falar as palavras magicas: ");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine(); 
         } while (!texto.equalsIgnoreCase("por favor"));

         System.out.println("Obrigada!");

         entrada.close(); 
    } 

}
