package gr.aueb.cf.ch15.Person;

public class Main {
    public static void main(String[] args) {
      Employee alice = new Employee(1, "Alice", "W.", 1000);

      alice.work();
      alice.speak();

        System.out.println("Firstname" +alice.getFirstname()
                + "Lastname" +alice.getLastname()
                + "Salary" +alice.getSalary());
    }
}
