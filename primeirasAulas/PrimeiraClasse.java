package primeirasAulas;
// Executando classe no terminal: java PrimeiraClasse.java

/*
 * public - Tipo de acesso da classe
 * class - Tipo da classse
 * PrimeiraClasse - Nome da classe
 */

public class PrimeiraClasse {
    
    public static void main(String[] args) {
        /* Alguns tipos de dados:
         * Números (int, double, float, long)
         * Texto (String) - com aspas duplas e S maiúsculo
         * Booleanos (boolean: true e false)
         */

         int dadoDoTipoInt = 10; // números inteiros
         // double dadoDoTipoDouble = 3.14; // números de ponto flutuante
         // float dadoDoTipoFloat = 4.15f; // números de ponto flutuante com menas precisão
         // long dadoDoTipoLong = 5156854841468l; // números inteiros muito grandes

         // if e else (se e senão)
         if (dadoDoTipoInt == 11) {
            // sysout
            System.out.println("Entrou no if");
         } else {
            System.out.println("Entrou no else");
         }

         //while (enquanto algo for true, faça alguma coisa)
         int valorInicial = 0;

         while (valorInicial < 3) {
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial ++;
         }

         System.out.println("Saiu do while");

         // For (loop)
         System.out.println("Iniciando o FOR");
         for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
         }

         System.out.println("Finalizando o FOR");
    }
}
