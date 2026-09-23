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

        System.out.println("\nLER TEXTO ATE A QUEBRA DE LINHA");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        System.out.printf("Dado 1: %s%nDado 2: %s%nDado 3: %s%n", s1, s2, s3);

        System.out.println("\nQUEBRA DE LINHA PENDENTE BUGADO");
        int i = sc.nextInt();
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();
        String s6 = sc.nextLine();
        System.out.printf("Dado 1 (int): %d%nDado 2: %s%nDado 3: %s%nDado 4: %s%n", i, s4, s5, s6);

        System.out.println("\nQUEBRA DE LINHA PENDENTE BUGADO");
        int i2 = sc.nextInt();
        sc.nextLine();
        String s7 = sc.nextLine();
        String s8 = sc.nextLine();
        String s9 = sc.nextLine();
        System.out.printf("Dado 1 (int): %d%nDado 2: %s%nDado 3: %s%nDado 4: %s%n", i2, s7, s8, s9);

        sc.close();
    }
}
