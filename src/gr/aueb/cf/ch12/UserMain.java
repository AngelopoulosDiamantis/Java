package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;

import javax.crypto.spec.PSource;

public class UserMain {
    public static void main(String[] args) {
        User user = new User(1, "George", "D.", "georgeg", "12345", true);
        User anna = new User(2, "Anna", "M.", "annam", "54321", false);

        System.out.println(user.getId());
        System.out.println(user.getFirstname());
        System.out.println(user.getLastname());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.isActive());

        System.out.println(anna.getId());
        System.out.println(anna.getFirstname());
        System.out.println(anna.getLastname());
        System.out.println(anna.getUsername());
        System.out.println(anna.getPassword());
        System.out.println(anna.isActive());

        





    }
}
