package secao_7_outros_topicos_basicos_sobre_java.aula_66_funcoes_interessantes_para_string;

public class FuncoesInteressantesParaString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("Original: -" + original + " |");

        String s01 = original.toLowerCase();
        System.out.println("toLowerCase: -" + s01 + " |");

        String s02 = original.toUpperCase();
        System.out.println("toUpperCase: -" + s02 + " |");

        String s03 = original.trim();
        System.out.println("trim: -" + s03 + " |");

        String s04 = original.substring(2);
        System.out.println("substring(2): -" + s04 + " |");

        String s05 = original.substring(2, 9);
        System.out.println("substring(2, 9): -" + s05 + " |");

        String s06 = original.replace('a', 'x');
        System.out.println("replace('a', 'x'): -" + s06 + " |");

        String s07 = original.replace("abc", "xy");
        System.out.println("replace('abc', 'xy'): -" + s07 + " |");

        int i = original.indexOf("bc");
        System.out.println("Index of 'bc': " + i + " |");

        int j = original.lastIndexOf("bc");
        System.out.println("Last index of 'bc': " + j + " |");

        String original2 = "potato apple lemon";
        System.out.println("Original: -" + original2 + " |");

        String[] vect = original2.split(" ");
        System.out.println("Element 0: " + vect[0] + " |");
        System.out.println("Element 1: " + vect[1] + " |");
        System.out.println("Element 2: " + vect[2] + " |");
    }
}
