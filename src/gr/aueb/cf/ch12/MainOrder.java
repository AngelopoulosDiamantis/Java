package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Order;

public class MainOrder {
    public static void main(String[] args) {
        Order order = new Order(12, 300, "oranges", 4);

        System.out.println("UUID " + order.getUuid());
        System.out.println("Description " + order.getDescription());
        System.out.println("Formatted timestamp " + order.getFormattedTimestamp());
    }
}
