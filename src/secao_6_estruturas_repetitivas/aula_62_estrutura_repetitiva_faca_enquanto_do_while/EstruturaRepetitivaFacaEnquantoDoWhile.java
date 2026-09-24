package secao_6_estruturas_repetitivas.aula_62_estrutura_repetitiva_faca_enquanto_do_while;

/*
SINTAXE
do {
    comando 1
    comando 2
} while (condicao);

REGRA
true: volta
false: pula fora
*/

/*
PROBLEMA EXEMPLO
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir (s/n).Caso o usuário digite "s", repetir o
programa.
Formula: F = (9C / 5) + 32

EXEMPLO
Digite a temperatura em Celsius: 30.0
Equivalente em Fahrenheit: 86.0
Deseja repetir (s/n)? s
Digite a temperatura em Celsius: 21.0
Equivalente em Fahrenheit: 69.8
Deseja repetir (s/n)? s
Digite a temperatura em Celsius: -10.5
Equivalente em Fahrenheit: 13.1
Deseja repetir (s/n)? n
*/

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaFacaEnquantoDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resposta;

//        while (resposta != 'n' && (resposta == 's' || resposta == 'S')) {
//            System.out.print("Digite a temperatura em Celsius: ");
//            double celsius = sc.nextDouble();
//
//            double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
//            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
//
//            System.out.print("Deseja repetir (s/n)? ");
//            resposta = sc.next().charAt(0);
//        }
        do {
            System.out.print("\nDigite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);

            System.out.print("Deseja repetir (s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');

        sc.close();
    }
}
