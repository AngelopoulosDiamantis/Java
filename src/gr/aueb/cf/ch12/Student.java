package gr.aueb.cf.ch12;

/**
 * Java Bean  - POJO (Plain Old Java Object)
 * Java Bean is a Data class
 * Java Bean includes:
 * - Private Fields
 * Default constructor
 * Setters / Getters with  setXxx / getXxx
 */
public class Student {
    // Fields:
    private int id;
    private String lastname;
    private String firstname;

    // encapsulation when you give private access. It's Recommended!


    // Scope Levels:
    // 1. Class
    // 2. Classes to same package
    // 3. Deride Class
    // 4. Java World

    // Access Modifiers
    // 1. Public
    // 2. Private
    // 3. Protected
    // 4. Packages private (Default if not declare)

    /**
     * Default Constructor. Populates the state
     */
    public Student() {
    }
    /**
     * Overloaded constructor - populates the state
     * of instances based on specific values that
     * are given
     *
     * @param id of the student
     * @param firstname of the student
     * @param lastname of the student
     */
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
}
