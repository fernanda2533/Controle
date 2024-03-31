import java.util.Scanner;
public class WhileIndeterminado { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        /*While é mais usado para quando se tem uma situação
        com uma quantidade indeterminada de vezes a se repetir */

        String valor = "";
        while(!valor.equalsIgnoreCase("sair")) { 
            System.out.print("Você diz: ");
            valor = entrada.nextLine(); 
        } 

        entrada.close();
    }

}
