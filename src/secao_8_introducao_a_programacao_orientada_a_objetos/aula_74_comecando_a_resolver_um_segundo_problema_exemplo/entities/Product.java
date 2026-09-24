package secao_8_introducao_a_programacao_orientada_a_objetos.aula_74_comecando_a_resolver_um_segundo_problema_exemplo.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
