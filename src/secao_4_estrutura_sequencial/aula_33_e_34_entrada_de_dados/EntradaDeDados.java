package secao_4_estrutura_sequencial.aula_33_e_34_entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nLER TEXTO SEM ESPACO");
        String x = sc.next();
        System.out.println("Você digitou o texto sem espaco: " + x);

        System.out.println("\nLER NUMERO INTEIRO");
        int y = sc.nextInt();
        System.out.println("Você digitou o numero inteiro: " + y);

        System.out.println("\nLER NUMERO COM PONTO FLUTUANTE e DIGITAR COM VIRGULA");
        double z = sc.nextDouble();
        System.out.printf("Você digitou o numero com ponto flutuante e virgula: %.2f%n", z);

        System.out.println("\nLER NUMERO COM PONTO FLUTUANTE e DIGITAR COM PONTO");
        Locale.setDefault(Locale.US);
        Scanner sc2 = new Scanner(System.in);
        double p = sc2.nextDouble();
        System.out.printf("Você digitou o numero com ponto flutuante e ponto: %.2f%n", p);

        System.out.println("\nLER UM CARACTERE");
        char c = sc.next().charAt(0);
        System.out.println("Você digitou o caractere: " + c);

        System.out.println("\nLER VARIOS DADOS DE TIPOS DIFERENTES/IGUAIS NA MESMA LINHA SEPARADOS POR ESPACO (string int double,)");
        String texto = sc.next();
        int inteiro = sc.nextInt();
        double flutuante = sc.nextDouble();
        System.out.printf("Dado Texto: %s%nDado Inteiro: %d%nDado Flutuante com Virgula: %.2f%n", texto, inteiro, flutuante);

        System.out.println("\nLER VARIOS DADOS DE TIPOS DIFERENTES/IGUAIS NA MESMA LINHA SEPARADOS POR ESPACO (string int double.)");
        String texto2 = sc.next();
        int inteiro2 = sc.nextInt();
        double flutuante2 = sc2.nextDouble();
        System.out.printf("Dado Texto: %s%nDado Inteiro: %d%nDado Flutuante com Ponto: %.2f%n", texto2, inteiro2, flutuante2);

        sc.close();
    }
}
