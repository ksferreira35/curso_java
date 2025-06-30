package cap9.Orders;

public class Order {
    Integer codigo;
    Double subtotal;
    Double desconto;

    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    public Double getSubtotal() {
        return subtotal;
    }
    
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    public Double getDesconto() {
        return desconto;
    }
    
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    
    public Double getTotal() {
        return subtotal - desconto;
    }
    
}
