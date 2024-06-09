package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.MobileContact;

public class MobileContactMain {
    public static void main(String[] args) {
        MobileContact alice = new MobileContact("Alice", "W.", "6980498774");
        alice.insertContact();

        MobileContact mobileContact = alice.getContactPhoneNumber();

        System.out.println(mobileContact.contactToString());

    }
}
