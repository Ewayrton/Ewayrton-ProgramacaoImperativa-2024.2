import java.util.Scanner;

public class Main {

    public static Scanner ler = new Scanner(System.in);
    public static final int QTD_PESSOAS = 10;


    public static void main(String[] args) {
        Aluno[] array = new Aluno [QTD_PESSOAS];

        lerAlunos(array);

        int qtdAprovados = quantidadeAprovados(array,0);
        int qtdRep = array.length - qtdAprovados;

        Aluno[] aprovados = new Aluno[qtdAprovados];
        Aluno[] reprovados = new Aluno[qtdRep];

        preencherAproRepro(array, aprovados, reprovados);

        mensagemAprovados(aprovados);
        imprimir(aprovados);

        mensagemReprovados(reprovados);
        imprimir(reprovados);





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
        

        System.out.print("Digite a 2ª nota do Aluno: ");
        double nota2 = ler.nextDouble();


        System.out.print("Digite a 3ª nota do Aluno: ");
        double nota3 = ler.nextDouble();
        ler.nextLine();

        double mediafinal = (nota1 + nota2 + nota3) / 3;

        return new Aluno(matricula, nome, nota1, nota2, nota3, mediafinal);

    }

    public static int quantidadeAprovados(Aluno[] a, int qtdApr ){
        int  qtdRep = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i].mediafinal < 5){
                qtdRep ++;
            }
            else {
                qtdApr ++;
            }
        }

        return qtdApr;

    }

    public static void preencherAproRepro(Aluno[] v, Aluno[] ap, Aluno[] rep){
        int indexApro = 0, indexRepro = 0;

        for (int i = 0; i < v.length; i++) {
         if (v[i].mediafinal < 5) {
            rep[indexRepro] = v[i];
            indexRepro ++;

         } else {
            ap[indexApro] = v[i];
            indexApro ++;
         }
        }
    }

    public static void mensagemAprovados(Aluno[] a){
        String feliz = "\uD83D\uDE0A";

        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s%s%s%s Alunos Aprovados %s%s%s%s%s%s%s%s%s%s%s%s%s\n", feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz,
                feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz, feliz);
    }

    public static void mensagemReprovados(Aluno[] r){
        String triste = "\uD83D\uDE22";

        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s%s%s%s Alunos Reprovados %s%s%s%s%s%s%s%s%s%s%s%s%s\n ",triste, triste,triste,triste, triste, triste, triste, triste,
                triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste, triste);

    }

}