package PedidoComposicao;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Name of the client:");
        String name = sc.nextLine();
        System.out.print("Your email:");
        String email = sc.nextLine();
        System.out.print("Birth date:");
        String date = sc.nextLine();
        LocalDate dateConversion = LocalDate.parse(date, formatter);
        Client client = new Client(name, email, dateConversion);

        System.out.println("Enter order data:");
        System.out.println("Status:");
        String status = sc.nextLine();
        System.out.print("How many items to this order: \n");
        int howMany = sc.nextInt();
        int count = 0;
        LocalDate dateOfThePurchase = LocalDate.now();
        Order order = new Order(dateOfThePurchase, OrderStatus.valueOf(status));
        for(int i = 0; i < howMany;i++){
            count++;
            order.addItem();   
        }
        
        System.out.println(order);



        sc.close();
    }
    
}
