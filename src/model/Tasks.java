package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="tasks")
public class Tasks implements Serializable {
    @Id
    private String title;
    private String details;
    private Date DeadlineDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employeeId")
    private Employees employee;

    public Tasks() {
    }

    public Tasks(String title, String details, Date DeadlineDate, Employees employee) {
        this.title = title;
        this.details = details;
        this.DeadlineDate = DeadlineDate;
        this.employee = employee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDeadlineDate() {
        return DeadlineDate;
    }

    public void setDeadlineDate(Date DeadlineDate) {
        this.DeadlineDate = DeadlineDate;
    }

    public Employees getEmployee() {
        return employee;
    }

    public void setEmployee(Employees employee) {
        this.employee = employee;
    }

    
}
