public class WhileDeterminado {
    public static void main(String[] args) { 
        /*Quando quisermos que algo se repita um determinado
         * número de vezes, utilizamos estruturas de repetição
         * ou loops, como o "while". */ 
        
         /* Primeiro criamos uma variavel para
          * controlar a quantidade de repetições do while */ 

          double contador = 2.5; 

          /*Quando implementado um loop "While" 
          deve ser retornado Verdadeiro ou falso
          logo, se a expressão for verdadeira, irá ficar 
          repetindo até que se torne falsa e pare o loop  */

          while(contador <= 10){ 
            System.out.println("Bom dia!");
          } 

          /*No exemplo acima, a expressão é verdadeira, pois, 
          (contador = 1) e é menor do que 10. Dessa forma,
          "Bom dia" será mostrado na tela. Todavia, apararecerá
          inifnitas vezes por não haver nada na expressão
          que faça retornar um valor falso e parar o loop. 
          Obs: chama-se de loop infinito 
           */ 

          while(contador > 0 && contador <= 15.5){ 
            System.out.printf("i = %.2f\t", contador);
            contador +=2.5; 

            /*O incremento "contador++" faz com que limite
             * de certa forma, a quantidade de vezes em que irá
             * ser executado, pois, a expressão irá retornar um falso*/
        
          } 

          // Para testar, utilize apenas uma das formas 
          // de uso para que dê certo


    }

}
