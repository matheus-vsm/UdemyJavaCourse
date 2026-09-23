package secao_5_estrutura_condicional.aula_42_estrutura_condicional_if_else;

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
