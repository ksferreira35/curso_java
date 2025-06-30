package cap9.FirstClass;

public class Class {

    public static void main(String[] args) {
        Product product = new Product();
        product.nome = "Smartphone";
        product.precoUnitario = 500.0;
        product.quantidade = 15;

        exibirQuantidadeEmEstoque(product);
    }

    static void exibirQuantidadeEmEstoque(Product product) {
        System.out.println("Product: " + product.nome + ".\nQuantity in stock " + product.quantidade + " units.");
    }
}
