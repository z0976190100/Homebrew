package xml_train;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {


    private long id;

    private String firstName;

    private String surName;

    private String phoneNumber;

    private String password;

    private String employment;

    private Role role;

    private boolean logged;

    public User() {}

    public long getId() {
        return id;
    }
    @XmlElement
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    @XmlElement
    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getSurName() {
        return surName;
    }
    @XmlElement
    public void setSurName(String last_name) {
        this.surName = last_name;
    }

    public String getPhoneNumber() { return phoneNumber; }
    @XmlElement
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPassword() { return password; }


    @XmlAttribute(name = "attr", required = true)
    public void setPassword(String password) { this.password = password; }

    public String getEmployment() { return employment; }
    @XmlElement
    public void setEmployment(String employment) { this.employment = employment; }

    public Role getRole() {
        return role;
    }
    @XmlElement
    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isLogged() {
        return logged;
    }
    @XmlElement
    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}



