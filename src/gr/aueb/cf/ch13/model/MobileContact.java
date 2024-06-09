package gr.aueb.cf.ch13.model;

import java.util.Arrays;

public class MobileContact {

    private final static MobileContact[] contacts = new MobileContact[500];

    private static int pivot = -1;


    private String firstname;
    private String lastname;
    private String phoneNo;

     public MobileContact() {

     }

    public MobileContact(String firstname, String lastname, String phoneNo) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNo = phoneNo;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //Service API





    // CRUD API

    public boolean insertContact() {
        if (isFull()) {
            return false;
        }
        if (getIndexByPhoneNumber() != -1) {
            return false;
        }

        pivot++;
        contacts[pivot].setFirstname(firstname);
        contacts[pivot].setLastname(lastname);
        contacts[pivot].setPhoneNo(phoneNo);
        return true;
    }

    public boolean updateContact() {
         int positionToUpdate = getIndexByPhoneNumber();

         if (positionToUpdate == -1) {
             return false;
         }

        contacts[positionToUpdate].setFirstname(firstname);
        contacts[positionToUpdate].setLastname(lastname);
         return true;

    }

    public boolean deleteContact() {
         int positionToDelete = getIndexByPhoneNumber();

         if (positionToDelete == -1) {
             return false;
         }
         if (positionToDelete != pivot) {
             System.arraycopy(contacts, positionToDelete +1, contacts,
                     positionToDelete, pivot - positionToDelete);
         }
         pivot--;
         return true;
    }

    public MobileContact getContactPhoneNumber() {
         int positionToReturn = getIndexByPhoneNumber();
         return (positionToReturn == -1) ? null : contacts[positionToReturn];
    }

    public static MobileContact[] getContacts() {

         return Arrays.copyOf(contacts, pivot +1);

    }

    private boolean isFull() {
         return pivot == contacts.length - 1;
    }

    private int getIndexByPhoneNumber() {
         for (int i = 0; i <= pivot; i++) {
             if (contacts[i].getPhoneNo().equals(phoneNo)){
                 return i;
             }
         }
         return -1;
    }
    public String contactToString() {
        return firstname + ", " + lastname + ", " + phoneNo;
    }
}
