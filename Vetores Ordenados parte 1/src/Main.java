import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int tam = 50;
        int[] array = new int[tam];

        preencherVetor(array);
        System.out.println("Vetor não ordenado:");
        imprimirVetor(array);

        bubbleSort(array);
        System.out.println("\nVetor ordenado usando o buuble sort:");
        imprimirVetor(array);

        menorMaior(array);

        mediana(array);

        listaRepetido(array);

        vetorSemRepetir(array);



    }

    public static void preencherVetor(int[] v){
        Random sorteador = new Random();

        for (int i = 0; i < v.length; i++) {
            v[i] = sorteador.nextInt(10) + 1 ;
        }

        System.out.println("Vetor preenchido com sucesso!");

    }


    public static void bubbleSort(int[] v) {

        int fim = v.length -1;
        int apoio = 0;
        int posicao = 0;
        boolean trocou = true;

        do {
            trocou = false;
            for (int i = 0; i < fim; i++) {

                if (v[i] > v[i + 1]) {
                    apoio = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = apoio;
                    posicao = i;
                    trocou = true;
                }

            }
            fim = posicao ; // quando coloquei "posicao -1" nao deu certo. Porém colocando apenas "posicao" da certo.

        } while(trocou);

    }

    public static void menorMaior(int[] v){
        System.out.printf("O menor valor é: %d\n", v[0]);
        System.out.printf("O maior valor é: %d\n", v[v.length -1]);
    }

    public static void mediana(int[]v){
        double mediana = (v[v.length / 2] + v[v.length / 2 -1]) /2;

        System.out.printf("A mediana deste vetor é: %.2f\n",mediana);
    }

    public static void listaRepetido(int[] v){
        int cont = 1;
        for (int i = 0; i < v.length -1; i++) {


            if (v[i] == v[i +1]){
                cont ++;
            }
            else {

                System.out.printf("Valor %d - repetições = %d \n", v[i], cont);
                cont = 1;
            }

        }

        System.out.printf("Valor %d - repetições = %d \n", v[v.length -1], cont);

    }

    public static void vetorSemRepetir(int[] v) {
        int qtd = 1;

        for (int i = 1; i < v.length; i++) {

            if (v[i] != v[i - 1]){
                qtd ++;

            }

        }

        int[] v2 = new int[qtd];

        v2[0] = v[0];
        int j = 1;
        for (int i = 1; i < v.length ; i++) {
            if (v[i] != v[i - 1]){
                v2[j] = v[i];
                j++;
            }

        }
        imprimirVetor(v2);

    }






    public static void imprimirVetor(int[] v){
        System.out.print("{ ");
        for (int i = 0; i < v.length; i++) {

            System.out.print(v[i]);

            if (i < v.length -1 ){
                System.out.print(", ");

            }
        }
        System.out.print(" }\n");
    }


}