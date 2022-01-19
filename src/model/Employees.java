package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employees implements Serializable {
    @Id
    private String employeeId;
    private String fullname;
    private String manager;
    @OneToMany(mappedBy = "employee")
    private List<Tasks> tasks;
    
    public Employees() {
        
    }

    public Employees(String employeeId, String fullname, String manager, List<Tasks> tasks) {
        this.employeeId = employeeId;
        this.fullname = fullname;
        this.manager = manager;
        this.tasks = tasks;
    }
    
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }    

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }

    
}
