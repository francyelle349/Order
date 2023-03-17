package PedidoComposicao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private LocalDate moment;
    private OrderStatus status;
    private List <OrderItem> orderItem = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    private Order(){
        
    }

    public Order(LocalDate dateOfThePurchase, OrderStatus status) {
        this.moment = dateOfThePurchase;
        this.status = status;
    }
   
    public LocalDate getMoment() {
        return moment;
    }
    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(){
        

        System.out.println("Name of The product:");
        String name = sc.nextLine();
        System.out.println("Price:");
        Double price = sc.nextDouble();

        System.out.println("Quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();
        

        Product product = new Product(name,price);
        OrderItem newOrder = new OrderItem(product, quantity);
        orderItem.add(newOrder);
        
        
    }
    public void removeItem(){
        int index = sc.nextInt();
        orderItem.remove(index);

        
    }

    public Double total(){
        double total = 0;
        for(OrderItem x: orderItem){
           total += x.Subtotal();
        }
        return total;
    }
    

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment:"+getMoment() + "\n"); //trocar para local date e mudar o formato dele
        sb.append("Order Status:"+ getStatus()+ "\n");
        sb.append("Order Items: \n");
        for(OrderItem item: orderItem){
            sb.append("-").append(item.toString()).append("\n");
        }

        sb.append("Total price: $"+total());
        return sb.toString();

        

    }
    
    

    
    
}
