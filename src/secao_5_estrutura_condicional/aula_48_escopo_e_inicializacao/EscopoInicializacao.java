package secao_5_estrutura_condicional.aula_48_escopo_e_inicializacao;

public class EscopoInicializacao {
    public static void main(String[] args) {
        double price = 400.0;
        double discont;

        if (price < 200.0) {
            discont = price * 0.1;
        } else {
            discont = 0.0;
        }

        System.out.println(discont);
    }
}
