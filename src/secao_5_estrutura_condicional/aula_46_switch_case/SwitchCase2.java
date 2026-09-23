package secao_5_estrutura_condicional.aula_46_switch_case;

import java.util.Scanner;

/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1  domingo, 2 = segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.

ENTRADA          SAIDA
1                Dia da semana: domingo
4                Dia da semana: quarta
9                Dia da semana: valor inválido
*/

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "segunda";
            case 3 -> "terca";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            case 7 -> "sabado";
            default -> "valor invalido";
        };

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
