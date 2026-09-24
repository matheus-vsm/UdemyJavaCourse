package secao_5_estrutura_condicional.aula_42_estrutura_condicional_if_else;

/*
SINTAXE
if ( condição 1) {
    comando 1
    comando 2
} else if ( condição 2 ) {
    comando 3
    comando 4
} else if ( condição 3 ) {
    comando 5
    comando 6
} else {
    comando 7
    comando 8
}

REGRA
true: executa somendo o bloco if
false: executa somente o bloco else
 */

import java.util.Scanner;

public class EstruturaCondicionalIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        System.out.print("Que horas são? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
