import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.String.format;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Calculadora Simples!");
        calcSimples();
        System.out.println("Calculadora IMC!");
        imc();
        System.out.println("Calculadora INSS!");
        inss();
        System.out.println("Calculadora Imposto de renda!");
        irenda();
        System.out.println("Números ímpares e pares!");
        imparpar();
        System.out.println("Fatorial de um número!");
        fatorial();
        System.out.println("Tabuada!");
        tabuada();
    }

    public static void calcSimples(){
        double divisao = 0;

        System.out.print("Insira o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = entrada.nextInt();
        System.out.print("A soma dos números é: " + (num1 + num2) +"\n");
        System.out.print("A subtração dos números é: " + (num1 - num2) + "\n");
        System.out.print("A multiplicação dos números é: " + (num1 * num2) + "\n");
        if (num2 != 0) {
            divisao = (double) num1 / num2;
            System.out.println(format("A divisão dos números é: %.2f" , divisao ,"\n"));
        } else {
            System.out.print("Não é possível dividir por ZERO! \n");
        }
    }
    public static void imc(){
        double imc = 0;
        System.out.print("Informe sua altura (em metros, ex: 1,70): ");
        double altura = entrada.nextDouble();
        System.out.print("Informe seu peso (em kg, ex: 75): " + "\n");
        double peso = entrada.nextDouble();
        imc = peso / (altura * altura);
        System.out.println(format("O seu imc é:  %.2f", imc ));
        if (imc < 18.5){
            System.out.println("Você está abaixo do peso!");
        } else if (imc < 25){
            System.out.println("Você está no peso adequado!");
        } else if (imc < 30){
            System.out.println("Você está no sobrepeso!");
        } else if (imc < 35){
            System.out.println("Você está no grau de obesidade 1!");
        } else if (imc < 40){
            System.out.println("Você está no grau de obesidade 2!");
        } else {
            System.out.println("Você está no grau de obesidade extrema!");
        }

    }

    public static void inss(){
        double desc, desc2 = 0;
        System.out.print("Informe o valor do seu salário bruto: ");
        double salario = entrada.nextDouble();
        if (salario <= 1412){
            desc = salario * 0.075 ;
            desc2 = desc /2;
            System.out.println("O valor total de contribuição é R$: "+ desc +" (50% custeado pela empresa!)" );
            System.out.println("Você pagará " + "R$ " + desc2 +" de imposto! ");
            System.out.println("Seu salário líquido é: " + (salario - desc2)  );
        } else if (salario < 2666.69 ){
            desc = salario * 0.09 ;
            desc2 = desc /2;
            System.out.println("O valor total  de contribuição é R$: " + desc +" (50% custeado pela empresa!)" );
            System.out.println("Você pagará " + "R$ " + desc2 +" de imposto! ");
            System.out.println("Seu salário líquido é R$: " + (salario - desc2));
        } else if (salario < 4000.03 ){
            desc = salario * 0.12 ;
            desc2 = desc /2;
            System.out.println("O valor total  de contribuição é R$: " + desc +" (50% custeado pela empresa!)" );
            System.out.println("Você pagará " + "R$ " + desc2 +" de imposto! ");
            System.out.println("Seu salário líquido é R$: " + (salario - desc2));
        } else {
            desc = salario * 0.14 ;
            desc2 = desc /2;
            System.out.println("O valor total  de contribuição é R$: " + desc +" (50% custeado pela empresa!)" );
            System.out.println("Você pagará " + "R$ " + desc2 +" de imposto! ");
            System.out.println("Seu salário líquido é R$: " + (salario - desc2));
        }
    }

    public static void irenda(){
        double ir = 0;
        System.out.print("Informe seu salário bruto: " );
        double salario = entrada.nextDouble();
        if (salario <= 2259.20){
            System.out.println("Você é isento de imposto de renda!!");

        } else if (salario <= 2826.65){
            ir = (salario - 2259.20) * 0.075;
            System.out.println(format("Valor do IR a ser descontado: %.2f" , ir));


        } else if (salario <= 3751.05) {
            ir = (salario - 2259.20) * 0.15;
            System.out.println(format("Valor do IR a ser descontado: %.2f", ir));

        } else if (salario <= 4664.68) {
            ir = (salario - 2259.20) * 0.225;
            System.out.println(format("Valor do IR a ser descontado: %.2f", ir));

        } else {
            ir = (salario - 2259.20) * 0.275;
            System.out.println(format("Valor do IR a ser descontado: %.2f", ir));

        }

    }

    public static void imparpar(){
        System.out.println("Informe o primeiro número do intervalo: ");
        int num1 = entrada.nextInt();
        System.out.println("Informe o segundo número do intervalo: ");
        int num2 = entrada.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Os números pares entre " +menor +" e " + maior + " são: ");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                System.out.print(i +", ");

            }
        }

        System.out.println("\nOs números ímpares entre " +menor +" e " + maior + " são: ");
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }

        }
        System.out.println(" ");
    }

    public static void fatorial(){
        int fator = 1;
        System.out.println("Informe um número inteiro positivo: ");
        int num = entrada.nextInt();
        int numoriginal = num;
        while (num > 1) {
            fator = fator * num; num --;
        }
        System.out.println(" o fatorial de " + numoriginal + " é : " + fator);

    }

    public static void tabuada(){
        int tab = 0;

        System.out.println("Informe um número inteiro: ");
        int num = entrada.nextInt();
        System.out.println("Aqui está a tabuada de " + num + ": ");
        while (tab <= 10) {
            System.out.println(num + "x" + tab + " = " + num * tab);
            tab ++;

        }

    }


}