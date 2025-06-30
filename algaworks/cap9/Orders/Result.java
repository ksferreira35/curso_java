package cap9.Orders;

public class Result {
    public static void main(String[] args) {
        Order order = new Order();

        order.setCodigo(1);
        order.setSubtotal(100.00);
        order.setDesconto(5.0);

        System.out.println("Código " + order.getCodigo() + ", SubTotal: R$" + order.getSubtotal() + ", Desconto: R$" + order.getDesconto() + ", Total R$" + order.getTotal());
    }
}
