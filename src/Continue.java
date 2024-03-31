public class Continue {
    public static void main(String[] args) { 
        // com o 'continue' ele passa para a proxima
        // iteração sem executar a expressão ao qual foi incluído
        //ou seja, ele ignora e passa para a proxima

        for (int i = 1; i <= 10; i++) { 
            if(i == 5) { 
                continue;
            } 
            System.out.println(i);
            
        }
    }

}
