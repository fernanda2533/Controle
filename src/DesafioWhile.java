import java.util.Scanner;
public class DesafioWhile { 
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in); 

// calcular a media das notas dos alunos da turma 
// não há um numero de alunos definido
// validar as notas  >=0 <=10
// guardar as notas em uma variável
// variável para guardar o somatório de todas as notas
// variavel pra guardar notas validas registradas
// variavel mádia (no final) 
// finaliza o programa quando o usuário digitar -1

        /*Definição de variáveis */
    int quantidadeDeNotas = 0;
    double nota = 0;
    double total = 0; 

        /*Entrada de dados e Processamento  */
    while(nota != -1) { 
        System.out.println("Informe a nota (ou digite -1 para encerrar)");
        nota = entrada.nextDouble();
        if(nota >=0 && nota <= 10){  
        total += nota;
        quantidadeDeNotas++;
        } else if(nota!= -1) { 
        System.out.println("Nota inválida! ");
        }
    }
    double media = total / quantidadeDeNotas; 
        /*Saída */
    System.out.printf("Média = %.2f ", media);
 
    entrada.close();       
    }
}
