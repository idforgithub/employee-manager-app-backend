package inverterproject.inverterproject.core.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imgUrl;

    public Employee(){}

    public Employee(String name, String email, String jobTitle, String phone, String imgUrl, String employeeCode, Long id){
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.employeeCode = employeeCode;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee:{ id='"+this.id+"', name='"+this.name+"', email='"+this.email+"', jobTitle='"+this.jobTitle+"', phone='"+this.phone+"', imgUrl='"+this.imgUrl+"' }";
    }
}
