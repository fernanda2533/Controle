public class Break {
    public static void main(String[] args) { 
        // Break quebra o fluxo
        // ainda que tenha outras linhas de código,
        // mas se a expressão for verdadeira e ele tiver incluido, ele para e encerra 
        //o bloco de código.
        // obs: faz sentido usa-lo dentro
        // de um laço de repetição

        for (int i = 0; i < 10; i++) {
            System.out.println("Bom dia"); 
            if(i == 5) { 
                break;
            } 
            System.out.println(i);
        }
        System.out.println("Fim");
    }

}
