package gr.aueb.cf.ch12;

/**
 * Java Bean - POJO
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;

    public Teacher() {

    }

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    // setters & getters START
    public int getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    // setter & getter END
}
