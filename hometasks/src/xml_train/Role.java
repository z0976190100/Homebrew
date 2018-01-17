package xml_train;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


public class Role {

    private String role;

    private String grade;

  

    public String getRole() {
        return role;
    }
@XmlElement
    public void setRole(String role) {
        this.role = role;
    }

    public String getGrade() {
        return grade;
    }
@XmlAttribute(name = "grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
