package secao_4_estrutura_sequencial.aula_31_saida_de_dados;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {
        System.out.println("TEXTO QUALQUER");
        System.out.println("Olá mundo!");
        System.out.print("Sem quebra de linha");
        System.out.println("Bom dia");

        System.out.println("\nVARIAVEL TIPO BASICO");
        int y = 32;
        System.out.println(y);

        System.out.println("\nVARIAVEL COM PONTO FLUTUANTE");
        double x = 10.327251626;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        System.out.println("\nALTERANDO O SEPARADOR DE DECIMAIS");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("\nCONTATENAR VARIOS ELEMENTOS EM UM MESMO COMANDO DE ESCRITA");
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.4f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
