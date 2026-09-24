package secao_7_outros_topicos_basicos_sobre_java.aula_68_funcoes_sintaxe;

/*
PROBLEMA EXEMPLO
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

EXEMPLO
Enter three numbers:
5 8 3
Higher = 8
 */

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
