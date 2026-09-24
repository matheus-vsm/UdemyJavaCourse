package secao_4_estrutura_sequencial.aula_32_processamento_de_dados_em_java_e_casting;

/*
SINTAXE
variavel = expressao;

REGRA
1: a expressao é calculada
2: o resultado da expressão é armazenado na variavel
*/

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        System.out.println("EXEMPLO 1");
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("\nEXEMPLO 2");
        int x2;
        double y2;
        x2 = 5;
        y2 = 2 * x2;

        System.out.println(x2);
        System.out.println(y2);

        System.out.println("\nEXEMPLO 3");
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;

        System.out.println(area);

        System.out.println("\nEXEMPLO 3.2");
        float b2, B2, h2, area2;
        b2 = 6f;
        B2 = 8f;
        h2 = 5f;
        area2 = (b2 + B2) / 2f * h2;

        System.out.println(area2);

        System.out.println("\nEXEMPLO 4");
        int a4, b4;
        double resultado;
        a4 = 5;
        b4 = 2;
        resultado = a4 / b4;

        System.out.println(resultado);
    }
}
