package secao_6_estruturas_repetitivas.aula_52_estrutura_repetitiva_enquanto_while;

/*
SINTAXE
while ( condicao ) {
    comando 1
    comando 2
}

REGRA
true = executa e volta
false = pula fora
*/

/*
PROBLEMA EXEMPLO
Fazer um programa que lê números inteiros até que um zero seja lido.
Ao final mostrar a soma dos números lidos.
ENTRADA         SAIDA
5 2 4 0         11
*/

import java.util.Scanner;

public class EstruturaRepetitivaEnquantoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (0 para parar): ");
        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            System.out.print("De novo: ");
            x = sc.nextInt();
        }

        System.out.printf("\nSoma: %d", soma);
        sc.close();
    }
}
