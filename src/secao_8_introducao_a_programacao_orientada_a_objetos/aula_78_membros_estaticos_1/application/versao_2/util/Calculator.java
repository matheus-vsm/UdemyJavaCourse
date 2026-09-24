package secao_8_introducao_a_programacao_orientada_a_objetos.aula_78_membros_estaticos_1.application.versao_2.util;

public class Calculator {
    public final double PI = 3.14159;

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
