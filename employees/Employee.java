/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

import java.time.LocalDate;
import people.Person;

/**
 *
 * @author zulay
 */
public class Employee extends Person {
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String position, double salary, String id, String name, LocalDate birthDate, String phone, String email) {
        super(id, name, birthDate, phone, email);
        this.position = position;
        this.salary = salary;
    }
     
    public Employee() {
        this("", 0.0, "", "", null, "", "");       
    }

    @Override
    public String toString() {
        return super.toString() + " position=" + position + ", salary=" + salary;
    }
}
