package secao_6_estruturas_repetitivas.aula_57_estrutura_repetitiva_para_for;

/*
SINTAXE
for ( inicio ; condicao ; incremento ) {
    comando 1
    comando 2
}

REGRAS
inicio: executa somente na primeira vez
condicao: true = executa e volta | false = executa toda vez depois de voltar
 */

/*
PROBLEMA EXEMPLO
Fazer um programa que lê um valor inteiro N e depois N números inteiros.
Ao final, mostrar a soma dos N números lidos.
ENTRADA         SAIDA
3 5 2 4         11
*/

import java.util.Scanner;

public class EstruturaRepetitivaParaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %d° valor: ", i+1);
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("\nSoma dos números digitados: " + soma);

        sc.close();
    }
}
