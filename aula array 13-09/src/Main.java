//ARRAYS
// ARRAY SÃO "VETORES UNIDIMENSIONAIS HOMOGENEOS"

import java.util.Scanner;
//Programa para fazer a média de 10 alunos!!
public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static int qtd_alunos = 10;

    public static void main(String[] args) {
        double[] notas = new double[qtd_alunos];
        double somatorio = 0.0;
        double media;

        for (int i = 0; i < qtd_alunos; i++) {
            System.out.printf("Digite a nota do aluno %d: " , i + 1);
            notas[i] = ler.nextDouble();
            somatorio += notas[i];

        }
        media = somatorio / qtd_alunos;
        System.out.printf("Media: %.2f\n", media);

        for ( int i = 0; i < qtd_alunos; i++) {//imprimir notas acima da média
            if (notas[i] > media) {
                System.out.printf("Nota acima dá média[%d] %.2f\n ", i, notas[i]);
            }
        }
        double maior = notas[0]; // imprimir a maior nota
        for (int i = 0; i < qtd_alunos; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.printf("Maior nota= %.2f\n", maior);

        //Calcula e imprime a nota mais próxima da média
        double maisProximaMedia = notas[0];
        for (int i = 1; i < qtd_alunos; i++) {
            if (Math.abs (media - notas[i]) < Math.abs(media - maisProximaMedia)) {
                maisProximaMedia = notas[i];
            }
        }
        System.out.printf("Maior nota= %.2f\n", maisProximaMedia);



        //mostrar a posição da nota mais proxima no array
        int maisProximaMediav2 = 0;
        for (int i = 1; i < qtd_alunos; i++) {
            if (Math.abs (media - notas[i]) < Math.abs(media - maisProximaMedia)) {
                maisProximaMediav2 =i;
            }
        }
        System.out.printf("Maior nota= %.2f\n", maisProximaMediav2, notas[maisProximaMediav2]);
    }
}