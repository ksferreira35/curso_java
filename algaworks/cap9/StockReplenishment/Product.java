package cap9.StockReplenishment;

public class Product {
    static final Integer MINIMUM_UNITS = 10;

    String nome;

    Integer quantidadeEstoque;
    
    Boolean needRestock(Product product) {
        return product.quantidadeEstoque < Product.MINIMUM_UNITS;
    } 
}
