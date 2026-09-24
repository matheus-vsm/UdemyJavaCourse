package secao_8_introducao_a_programacao_orientada_a_objetos.aula_73_criando_um_metodo_para_obtermos_os_beneficios_de_reaproveitamento_e_delegacao;

/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados
a,b e c é a seguinte (fórmula de Heron):
area = Math.sqrt(p(p - a)(p - b)(p - c)) onde p = (a + b + c) / 2

EXEMPLO
Enter the measures of triangle X:
3.00
4.00
5.00
Enter the measures of triangle Y:
7.50
4.50
4.02
Triangle X area: 6.0000
Triangle Y area: 7.5638
Larger area: Y
*/

import secao_8_introducao_a_programacao_orientada_a_objetos.aula_73_criando_um_metodo_para_obtermos_os_beneficios_de_reaproveitamento_e_delegacao.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class CriandoUmMetodoParaObtermosOsBeneficiosDeReaproveitamentoEDelegacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("\nEnter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("\nTriangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("\nLarger area: X");
        } else {
            System.out.println("\nLarger area: Y");
        }

        sc.close();
    }
}
