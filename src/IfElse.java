import java.util.Scanner;
import javax.swing.JOptionPane;
public class IfElse { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in); 

        /*Estrutura de controle If/Else
         * o "else" esta associado ao if 
         * e o "if" pode ter sua sentença verdadeira ou falsa
         * caso seja verdadeira, vai executar o bloco de código associado a ela
         * caso seja falsa, ira executar o bloco de codigo associado ao else
         */ 

        String valor = JOptionPane.showInputDialog("Informe o número: "); 
        int numero = Integer.parseInt(valor);

        /* Utilizando duas vezes o if */
        if(numero % 2 == 0) { 
            System.out.println("Número par!"); 
        } 
        if(numero % 2 == 1) { 
            System.out.println("Número ímpar!"); 
        }  

        /*Utilizando o if/else (mais prático) */
        if(numero % 2 == 0) { 
            System.out.println("Número é par!"); 
        } else { 
            System.out.println("Número é ímpar!");
        } 

        //Caso for testar as estruturas, execute de uma forma por vez
        // para que tenha resultado.

        entrada.close(); 
        // :)
    }

}
