
public class Student {

    // TODO: khai báo các thuộc tính cho Student

    private String name;
    private String id;
    private String group;
    private String email;



    // TODO: khai báo các phương thức getter, setter cho Student

    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getID()
    {
        return id;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup()
    {
        return group;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }



    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT2204";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CB";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.getName();
        this.id  = s.getID();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    String getInfo() {
        // TODO:
        return " Ten: " + name + " \n " +
                "Mssv: " + id + " \n " +
                "Group: " + group + " \n " +
                "Email: " + email + " \n";

    }
}
