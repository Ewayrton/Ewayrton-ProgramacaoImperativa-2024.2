/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ewayrton
{
    public static void main (String[] args) throws java.lang.Exception
    {

        listaNum();
        System.out.println();
        somarImpares();
        System.out.println();
        MultiplosDe3Sem3();
    }



    public static void listaNum() {

        // Cria uma string vazia para armazenar os números
        String numeros = "";

        // Loop de 1 a 100
        for (int i = 1; i <= 100; i++) {
            // Adiciona o número atual ao String
            numeros += i;

            // Se não for o último número, adiciona uma vírgula
            if (i < 100) {
                numeros += ", ";
            }
        }

        // Imprime a string resultante no console
        System.out.println("Lista dos números de 1 a 100:");
        System.out.println(numeros);
    }








    public static void somarImpares() {
        int soma = 0;

        // Loop de 10 a 1000
        for (int i = 10; i <= 1000; i++) {
            // Verifica se o número é ímpar
            if (i % 2 != 0) {
                soma += i; // Adiciona o número ímpar à soma
            }
        }
        System.out.println("A soma dos números ímpares entre 10 e 1000 é: " + soma);

    }

    public static void MultiplosDe3Sem3() {
        // Cria uma string vazia para armazenar os números
        String result = "";

        // Loop de 1 a 200
        for (int i = 1; i <= 200; i++) {
            // Verifica se o número é múltiplo de 3 e não termina em 3
            if (i % 3 == 0 && i % 10 != 3) {
                // Adiciona o número atual ao string
                result  += i;

                // Adiciona uma vírgula e um espaço após o número, exceto no último
                if (i < 198) {//coloquei 198 em vez de 200 porquê não tem mais mútiplo de 3 após 198. com isso consegui tirar a ultima vírgula
                    result += ", ";
                }
            }
        }



        System.out.println("Todos os números múltiplos de 3 entre 1 e 200 que não terminam em 3 são:");
        System.out.println(result.toString());
    }


}