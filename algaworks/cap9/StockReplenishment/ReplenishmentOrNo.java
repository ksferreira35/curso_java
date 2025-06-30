package cap9.StockReplenishment;

public class ReplenishmentOrNo {
    public static void main(String[] args) {
        Product product = new Product();
        product.nome = "Detergente";
        product.quantidadeEstoque = 8;

        System.out.println("Product stock needs to be replenished " + product.nome + "? " + product.needRestock(product));
    }
}

