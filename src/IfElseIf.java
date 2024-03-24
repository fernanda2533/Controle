import java.util.Scanner; 
public class IfElseIf { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble(); 

        /*Primeiro verificamos a validade das notas
        e em seguida damos inicio aos conceitos */ 

         if(nota > 10 || nota < 0) { 
            System.out.println("Nota inválida!");
        } else{ 
            if(nota >= 8.1) { 
            System.out.println("Conceito A"); 
            } else { 
                if(nota >= 6.5) { 
                    System.out.println("Conceito B");
                } else { 
                    if(nota >= 5.0 && nota <6.5){ 
                        System.out.println("Conceito C"); 
                    } else { 
                        if(nota >= 0 && nota < 5.0) { 
                            System.out.println("Conceito D");
                        }
                    }
                }
            }
        } 

        /*Temos outra forma de organizar */ 
        if(nota < 0 || nota > 10) { 
            System.out.println("Nota inválida!");
        }else if(nota >= 8.1) { 
            System.out.println("Conceito A");
        }else if(nota >= 6.5) { 
            System.out.println("Conceito B");
        }else if(nota >= 5.0 && nota <6.5){ 
            System.out.println("Conceito C");
        }else if(nota >= 0 && nota < 5.0){ 
            System.out.println("Conceito D");
        }

        /*Pra finalizar o bloco de controle, exibimos essa mensagem */
        System.out.println("Conceitos lançados!");

        /*Para testar, utilizar apenas uma das formas por vez para execução */

        entrada.close(); 
    }

}
