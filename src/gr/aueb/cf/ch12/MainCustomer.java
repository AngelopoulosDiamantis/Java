package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Customer;

public class MainCustomer {
    public static void main(String[] args) {

        
        Customer customer = new Customer();
        customer.setId(1);
        customer.setVatRegistrationNumber("115493895");
        
        Customer anna = new Customer(2, "anna", "115493896", "6980498774",
                "Attica", "Central Attica", "Athens", "Patision", "76", "10434");

        System.out.println("Anna's Vat " + anna.getVatRegistrationNumber());
        System.out.println("Customer's Vat " + customer.getVatRegistrationNumber());
    }
}
