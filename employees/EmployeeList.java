/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zulay
 */
public class EmployeeList {
     private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    //Agregar
<<<<<<< HEAD
    public void addEmployee(String id, String name, LocalDate birthDate, String phone, String email, String position, double salary) {
        Employee newEmployee = new Employee(position, salary, id, name, birthDate, phone, email);
        employees.add(newEmployee);
=======
    public void addEmployee(Employee employee) {
     employees.add(employee);
>>>>>>> Zulay
    }
    
    //actualizar
    public boolean updateEmployee(String id, String newPhone, String newEmail, String newPosition, double newSalary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setPhone(newPhone);
            employee.setEmail(newEmail);
            employee.setPosition(newPosition, newSalary);
            return true;
        }
        return false;
    }
    
    //eliminar por su id
    public boolean removeEmployee(String id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
            return true;
        }
        return false;
    }
     
    //Buscar por su id
    public Employee findEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void listAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
