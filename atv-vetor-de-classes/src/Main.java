import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);
    public static final int QTD_PESSOAS = 10;


    public static void main(String[] args) {
        Aluno[] array = new Aluno [QTD_PESSOAS];

        lerAlunos(array);
        aprovaReprova(array);

    }

    public static void imprimir(Aluno[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void lerAlunos(Aluno[] a){

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Informe os dados do %dº aluno: \n",i + 1);
            a[i] = lerAluno();
        }
    }

    public static Aluno lerAluno(){
        System.out.print("Digite o nome da Aluno: ");
        String nome = ler.nextLine();

        System.out.print("Digite a matricula do Aluno: ");
        int matricula = ler.nextInt();
        ler.nextLine();

        System.out.print("Digite a 1ª nota do Aluno: ");
        double nota1 = ler.nextDouble();
        ler.nextLine();

        System.out.print("Digite a 2ª nota do Aluno: ");
        double nota2 = ler.nextDouble();
        ler.nextLine();

        System.out.print("Digite a 3ª nota do Aluno: ");
        double nota3 = ler.nextDouble();
        ler.nextLine();

        double mediafinal = (nota1 + nota2 + nota3) / 3;

        return new Aluno(matricula, nome, nota1, nota2, nota3, mediafinal);

    }

    public static void aprovaReprova(Aluno[] a){
        int qtdApr = 0, qtdRep = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].mediafinal < 5){
                qtdRep ++;
            }
            else {
                qtdApr ++;
            }
        }
        Aluno[] apro = new Aluno[qtdApr];
        Aluno[] repro = new Aluno[qtdRep];

        int indexApro = 0, indexRepro = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].mediafinal < 5) {
               repro[indexRepro] = a[i];
                indexRepro ++;

            } else {
               apro[indexApro] = a[i];
                indexApro ++;
            }
        }

        String feliz = "\uD83D\uDE0A";

        String triste = "\uD83D\uDE22";

        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s%s%s%s Alunos Aprovados %s%s%s%s%s%s%s%s%s%s%s%s%s\n", feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz,
                feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz);
        imprimir(apro);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s%s%s%s Alunos Reprovados %s%s%s%s%s%s%s%s%s%s%s%s%s\n",triste, triste,triste,triste, triste, triste, triste, triste,
                triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste);
        imprimir(repro);
    }

}