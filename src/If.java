import java.util.Scanner;
public class If {
    public static void main(String[] args) throws Exception { 
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble(); 
        /*Utilização de estrutura de controle - if
         * Obs: o "if" retorna verdadeiro ou falso
         * ou seja, se a condição for atendida, o bloco associado a condição
         * é executado. Entretanto, se a condição nao for atendida, não executa nada
         */

        if(media >= 7) { 
        System.out.println("Aprovado!");
        System.out.println("Parabéns!"); 
        } 
        if(media < 7 && media >= 4.5) { 
            System.out.println("Aluno em recuperação!"); 
        } 
        if(media >= 0 && media < 4.5) { 
            System.out.println("Aluno reprovado!"); 
        } 

        /*Para expressões muito longas, coloca-las em variaveis
        Lembrando que: o retorno de uma estrutura de controle deve ser
        verdadeiro ou falso, logo, variavel do tipo boolean */ 

        boolean criterioReprovacaoAtingido = 
        media < 7 && media >= 4.5; 
        if(criterioReprovacaoAtingido) { 
            System.out.println("Aluno pode sentar e chorar");
        } 

        /*Não usar ";" em estrutura de controle */
        // Finalize o scanner

        entrada.close();
        
    }
}
