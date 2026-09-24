package secao_5_estrutura_condicional.aula_46_switch_case;

import java.util.Scanner;

/*
SINTAXE
switch ( expressão ) {
case valor1:
    comando1
    comando2
    break;
case valor2:
    comando3
    comando4
    break;
default:
    comando5
    comando6
    break;
}
*/

/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1  domingo, 2 = segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.

ENTRADA          SAIDA
1                Dia da semana: domingo
4                Dia da semana: quarta
9                Dia da semana: valor inválido
*/

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
