import java.util.Scanner;
import javax.swing.JOptionPane;
public class DesafioDiaSemana { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        
        /*Pede ao usuário qual o dia da semana */
        String diaDaSemana = JOptionPane.showInputDialog("Digite o dia da semana: "); 

        /*Converte os dias da semana em numeros
         correlatos para devolver ao usuario
         utilizando estruturas de controle */ 

        if(diaDaSemana.equalsIgnoreCase("domingo")){ 
            System.out.println(1);
        } else if(diaDaSemana.equalsIgnoreCase("segunda")){ 
            System.out.println(2);
        }else if(diaDaSemana.equalsIgnoreCase("terça")){ 
            System.out.println(3);
        }else if(diaDaSemana.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        }else if(diaDaSemana.equalsIgnoreCase("quinta")){ 
            System.out.println(5);
        }else if(diaDaSemana.equalsIgnoreCase("sexta")){ 
            System.out.println(6);
        }else if(diaDaSemana.equalsIgnoreCase("sabado")){ 
            System.out.println(7);
        } else{ 
            System.out.println("Dia inválido");
        }

        System.out.println("Boa semana! ");
        entrada.close(); 
    }

}
