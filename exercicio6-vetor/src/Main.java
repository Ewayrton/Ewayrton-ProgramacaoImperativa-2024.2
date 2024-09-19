import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        vetorOrdenado();
    }

    public static Scanner entrada = new Scanner(System.in);

    public static void vetorOrdenado() {
        int[] vetor = new int[10];
        boolean ordenado = true;

        // Entrada de valores do usuário
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %dº valor: ", i + 1);
            vetor[i] = entrada.nextInt();
        }

        // Verificando se o vetor está ordenado
        for (int i = 1; i < vetor.length ; i++) {
            if (vetor[i] < vetor[i - 1]) {
                ordenado = false;
                break;
            }
        }

        // Informar se o vetor está ordenado ou não
        if (ordenado) {
            System.out.println("O vetor está ordenado!\n");
        } else {
            System.out.println("O vetor não está ordenado.\n");
        }

        // Iniciando busca de elementos no vetor
        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o valor a ser buscado: ");
            int busca = entrada.nextInt();
            entrada.nextLine();
            boolean encontrado = false;

            //busca melhorada
            if (ordenado){
                for (int i = 0; i < vetor.length ; i++) {
                    if (vetor[i] > busca){
                        break;
                    }
                    if (vetor[i] == busca){
                        encontrado = true;
                        System.out.printf("O elemento está na %dº posição do vetor! e foi o %dº elemento digitado, isso ocorre porque o vetor começa a armazenar apartir da posição 0!\n\n",i , i +1);
                        break;
                    }

                }
            }
            else

                //busca simples
                for (int i = 0 ; i < vetor.length ; i++){

                    if (busca == vetor[i]){
                        encontrado = true;
                        System.out.printf("O elemento está na %dº posição do vetor! e foi o %dº elemento digitado, isso ocorre porque o vetor começa a armazenar apartir da posição 0!\n\n",i , i +1);
                        break;
                    }
                }
            if (!encontrado) {

                System.out.println("O elemento não está na base de dados do vetor!\n");
            }
            System.out.println("Deseja realizar outra busca (s/n)?");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("n")){
                continuar = false;
            }
        }
    }
}