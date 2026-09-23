package secao_4_estrutura_sequencial.aula_32_processamento_dados_em_java_e_casting;

public class Casting {
    public static void main(String[] args) {
        System.out.println("\nEXEMPLO 4 com CASTING");
        int a4, b4;
        double resultado;
        a4 = 5;
        b4 = 2;
        resultado = (double) a4 / b4;

        System.out.println(resultado);

        System.out.println("\nEXEMPLO 5");
        double a5;
        int b5;
        a5 = 5.0;
        b5 = (int) a5;

        System.out.println(b5);
    }
}
