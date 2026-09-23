package secao_5_estrutura_condicional.aula_47_expressao_condicional_ternaria;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preco: ");
        double preco = sc.nextDouble();
//        double desconto;
//        if (preco < 20.0)
//            desconto = preco * 0.1;
//        else
//            desconto = preco * 0.05;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        sc.close();
    }
}
