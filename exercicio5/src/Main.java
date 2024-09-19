import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        anoNascimento();

    }

    public static Scanner entrada =  new Scanner(System.in);
    
    public static void anoNascimento(){
        int idade, mes = 0;

        System.out.print("Digite a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite o seu mes de aniversário (de 1 a 12): ");
        mes = entrada.nextInt();
        if (mes > 0 && mes <= 12) {

            if (mes > 9) {
                idade = idade - 2024 - 1;
            } else if (mes <= 9) {
                idade = idade - 2024;
            }
            System.out.println("Seu ano de nascimento é: " + idade);


        }else {
            System.out.println("Informe um número de mês válido! (1-12");
        }






    }
}
