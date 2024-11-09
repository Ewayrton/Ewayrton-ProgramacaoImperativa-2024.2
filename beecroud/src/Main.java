import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        //exercicio3();
       // exercicio4();
        //exercicio5();
       // exercicio6();
        //exercicio7();
        exercicio8();

    }

    public static void exercicio1(){

        int[] vetor = new int[10];


        for (int i = 0 ; i < vetor.length ; i ++) {
            vetor[i] = ler.nextInt();

            if (vetor[i] <= 0){
                vetor[i] = 1;
            }

        }

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("X[%d] = %d\n", i, vetor[i]);

        }

    }

    public static void exercicio2(){

            int[] vetor = new int[10];

            vetor[0] = ler.nextInt();

            for (int i = 1 ; i < vetor.length ; i ++) {

                vetor[i] = vetor[i - 1] *2;
            }

            for (int i = 0 ; i < vetor.length ; i++){
                System.out.printf("N[%d] = %d\n", i, vetor[i]);

            }

    }

    public static void exercicio3(){

     double[] vetor = new double[100];

     for (int i = 0 ; i < vetor.length ; i++){
         vetor[i] = ler.nextDouble();

     }

     for (int i = 0 ; i < vetor.length ; i++){

         if(vetor[i] <= 10) {
             System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
         }
     }

    }

    public static void exercicio4(){
        int tam = 20;
        int[] vetor = new int[tam];
        int[] vetor2 = new int[tam];

        for (int i = 0 ; i < vetor.length ; i++){
            vetor[i] = ler.nextInt();
        }

        for (int i = 0 ; i < vetor2.length ; i++){
            vetor2[i] = vetor[tam -1];
            tam --;

        }

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("N[%d] = %d\n", i, vetor2[i]);
            System.out.println("N [" +i + "] = " +vetor2[i]);
        }


    }

    public static void exercicio5(){ // tem que tirar as palavras de informações ao usuário para dar certo no beecrowd

        System.out.println("Informe o número de casos de teste: ");
        int T = ler.nextInt();
        System.out.println("Perfeito!! irei fazer " + T + " casos de teste!");

        long [] array = new long[61];

        array [0] = 0;
        array [1] = 1;

        for (int i = 2 ; i < array.length ; i++){
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i = 0 ; i < T ; i++){
            System.out.printf("Insira o %dº valor a ser testado!",i +1);
            int N = ler.nextInt();
            System.out.printf("Fib(%d) = %d\n", N, array[N]);
        }

    }

    public static void exercicio6(){
        int vetor[] = new int[1000];

        int T = ler.nextInt();


        for (int i = 0 ; i < vetor.length ; i++){
            vetor[i] = i % T;
        }

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("N[%d] = %d\n", i, vetor[i]);

        }

    }

    public static void exercicio7(){
    double vetor[] = new double[100];

    double X = ler.nextDouble();

    vetor[0] = X;

        for (int i = 1 ; i < vetor.length ; i++){
            vetor[i] = vetor[i - 1] / 2;

        }

        for (int i = 0 ; i < vetor.length ; i++){
            System.out.printf("N[%d] = %.4f\n", i, vetor[i]);

        }

    }

    public static void exercicio8(){// preencher vetor IV
        int[] par = new int[5];
        int[] impar = new int[5];
        int contPar = 0, contImpar = 0;


        for (int i = 0; i < 15; i++) {
            int num = ler.nextInt();


            if (num % 2 == 0) {
                par[contPar] = num;
                contPar++;
            } else {
                impar[contImpar] = num;
                contImpar++;
            }


            if (contPar == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                }
                contPar = 0;
            }


            if (contImpar == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                }
                contImpar = 0;
            }
        }


        for (int i = 0; i < contImpar; i++) {
            System.out.printf("impar[%d] = %d\n", i, impar[i]);
        }


        for (int i = 0; i < contPar; i++) {
            System.out.printf("par[%d] = %d\n", i, par[i]);
        }

    }

}