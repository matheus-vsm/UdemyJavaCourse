package secao_8_introducao_a_programacao_orientada_a_objetos.aula_79_membros_estaticos_2.versao_2.util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
