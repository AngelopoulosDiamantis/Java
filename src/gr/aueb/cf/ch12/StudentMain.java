package gr.aueb.cf.ch12;

/**
 * Like a client
 * 1. Creates an instance (alice)
 * 2. Invokes public methods (setters / getters)
 *
 * we can use @link Student - makes reference
 *
 */
public class StudentMain {
    public static void main(String[] args) {

        Student alice =  new Student(); //new Student(); is a constructor -  Initialization
        Student bob = new Student(2, "Bob", "Lastname");


        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("Id:" +alice.getId());
        System.out.println("Firstname:" +alice.getFirstname());
        System.out.println("Lastname:" + alice.getLastname());


    }
}
