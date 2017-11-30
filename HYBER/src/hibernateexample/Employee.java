package hibernateexample;
// Generated Dec 30, 2016 12:36:26 PM by Hibernate Tools 4.3.1

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



public class Employee  {


     private int id;
     private String firstName;
     private String lastName;
     private int salary;

     private String Department;

    public Employee() {
    }


    public Employee(String firstName, String lastName, int salary, String Department) 
    {
       this.firstName = firstName;
       this.lastName = lastName;
       this.salary = salary;
       this.Department = Department;
    
    }
   
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return Department;
    }
    
    public void setDepartment(String Department) {
        this.Department = Department;
    }



}


