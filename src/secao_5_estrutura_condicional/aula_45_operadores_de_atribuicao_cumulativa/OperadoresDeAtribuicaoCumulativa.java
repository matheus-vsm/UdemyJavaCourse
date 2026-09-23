package secao_5_estrutura_condicional.aula_45_operadores_de_atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

/*
Uma operadora de telefonia cobra R$50.00 por um plano básico que
dá direito a 100 minutos de telefone. Cada minuto que exceder a
franquia de 100 minutos custa R$2.00. Fazer um programa para ler a
quantidade de minutos que uma pessoa consumiu,daí mostrar o valor
a ser pago.

ENTRADA      SAIDA
22           Valor a pagar: R$50.00
103          Valor a pagar: R$56.00
*/

public class OperadoresDeAtribuicaoCumulativa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double conta = 50.0;

        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.println("Valor a pagar: R$" + String.format("%.2f", conta));

        sc.close();
    }
}
