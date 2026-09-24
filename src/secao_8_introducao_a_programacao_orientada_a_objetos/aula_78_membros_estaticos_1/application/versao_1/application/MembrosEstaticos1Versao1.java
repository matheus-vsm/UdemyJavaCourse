package secao_8_introducao_a_programacao_orientada_a_objetos.aula_78_membros_estaticos_1.application.versao_1.application;

/*
PROBLEMA EXEMPLO
Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma
circunferência e do volume de uma esfera para um raio daquele valor.
Informar também o valor de PI com duas casas decimais.

EXEMPLO
Enter radius: 3.0
Circumference: 18.85
Volume: 113.10
PI value: 3.14
*/

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos1Versao1 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("\nCircumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
        sc.close();
    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
