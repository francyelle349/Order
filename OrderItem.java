package PedidoComposicao;

public class OrderItem {

    private Product product;
    private int quantity;
   

     
    
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
  
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public double Subtotal(){
        double total = product.getPrice() * getQuantity();
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Produto: "+getProduct().getName()+",");
        sb.append(" $"+getProduct().getPrice()+",");
        sb.append(" Quantity:"+getQuantity());
        sb.append(", Subtotal: R$"+Subtotal());
        return sb.toString();



    }
    
}
