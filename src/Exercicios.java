import java.util.Random;
import java.util.Scanner;
public class Exercicios { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Criar um programa que receba um número
        e verifique se ele esta entre 0 e 10 e é par*/ 

        int numero01; 
        System.out.println("Informe um numero: "); 
        numero01 = entrada.nextInt(); 
        if(numero01 >= 0 && numero01 <= 10) { 
            if(numero01 % 2 == 0) { 
                System.out.println("O número esta entre 0 e 10 e é par!");
            } else { 
                System.out.println("Número é impar ou não esta entre 0 e 10");
            }
            } 

        /*Criar um programa informa se o ano atual é um ano bissexto */ 

        int ano; 
        System.out.println("Informe o ano: ");
        ano = entrada.nextInt(); 
        if(ano % 4 == 0){ 
        System.out.printf("O ano %d é bissexto! ", ano);
        } else{ 
            System.out.println("O ano não é bissexto!");
        }

        /*Criar um programa que receba duas notas parciais,
         * calcular a média final.
         * Se a nota do aluno for maior ou igual a 7, imprime no console
         * "Aprovado", se a nota for menor que 7 e maior que 4, imprime no console
         * "Recuperação", caso contrario imprime no console "Reprovado" */ 

         double nota1;
         double nota2;
         System.out.println("Informe a primeria nota do aluno: ");
         nota1 = entrada.nextDouble(); 
         System.out.println("Informe a segunda nota do aluno: ");
         nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2; 

         if(media >= 7) { 
            System.out.println("Aprovado");
         }else if(media >= 5 && media <= 6) { 
            System.out.println("Recuperação");
         } else { 
            System.out.println("Reprovado");
         } 
         System.out.printf("A média final do aluno foi %.2f", media); 

         /*Criar um programa que receba um numero
          e diga se ele é um numero primo com a estrutura switch */ 
         

          int numeroo; 
          System.out.println("Informe um número: ");
          numeroo = entrada.nextInt(); 
          switch (numeroo) { 
            case 1: 
            if(numeroo % 2 == 1) { 
            System.out.println("O Número é ímpar!");
            } else{ 
            System.out.println("Número é par!");
            } 
            break;
        }

        //Jogo de advinhação
        /*Tentar adivinhar um número entre 0 =100
         * Armazene um número aleatório em uma variável.
         * O jogador tem 10 tentativas para adivinhar o número gerado
         * Ao final de cada tentativa, imprima a quantidade de tentativas restantes
         * e imprima se o número inserido é maior ou menor do que o número armazenado */ 

         int continuar;
         int numeroSorteado;
         int tentativas;
         int numero;

         do { 
             System.out.println("Sorteando número entre 0 e 100...\n"); 
             Random numeroAleatorio = new Random(); 
             numeroSorteado = numeroAleatorio.nextInt(101); 

             System.out.println("Começou o jogo! Será que consegue me vencer?");
             tentativas = 0;
         do { 
            tentativas++;
            System.out.printf("Tentativas %d: ", tentativas); 
            numero = entrada.nextInt();

            if (numero > numeroSorteado) { 
                System.out.printf("\nO número sorteado é menor que %d\n\n", numero);

            }else if (numero < numeroSorteado) { 
                System.out.printf("\nO número sorteado e maior que %d\n\n", numero);
            } else { 
                System.out.printf("\nParabéns! VocÊ acertou o número em %d tentativas!\n\n", tentativas); 
                break; 
            }
             
         } while (tentativas != 10);
         System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
         continuar = entrada.nextInt();
        } while (continuar != 0); 
        
      
       entrada.close();
        }
    }


