package cap9.IstancesClass;

public class InstanceClass {
    public static void main(String[] args) {

        System.out.println("Quantidade minima estoque: " + Produto.quantidadeMin);
        
        Produto produto = new Produto();
        // produto.quantidadeMin = 10;
        produto.nome = "Caneca";

        System.out.println("Quantidade minima estoque: " + Produto.quantidadeMin);


        Produto produto2 = new Produto();
        produto2.nome = "Carteira";
        // produto2.quantidadeMin = 11;

        // System.out.println("Quantidade minima estoque: " + Produto.quantidadeMin);

        // System.out.println("Produto 1 " + produto.nome + "\nProduto 2 " + produto2.nome);

        Impressao.informacao("Produto1: " + produto.nome);
        Impressao.informacao("Produto2: " + produto2.nome);

        Impressao.erro("Produto1 (" + produto.nome + ") sem estoque.");
        Impressao.erro("Produto2 (" + produto2.nome + ") sem estoque.");
    }
}
