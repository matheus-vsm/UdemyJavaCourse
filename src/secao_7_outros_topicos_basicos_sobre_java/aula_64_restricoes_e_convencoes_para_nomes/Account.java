package secao_7_outros_topicos_basicos_sobre_java.aula_64_restricoes_e_convencoes_para_nomes;

public class Account {
    private String holder;
    private Double balance;

    public Account(String holder, Double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
