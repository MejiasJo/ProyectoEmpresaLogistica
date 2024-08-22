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
    public void addEmployee(Employee employee) {
     employees.add(employee);
    }
    
    //actualizar
    public boolean updateEmployee(Employee employee) {
        int index = employees.indexOf(employee);
        if (index !=-1) {
            employees.set(index, employee);
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
    
    public ArrayList<Employee> filteredCustomers(String text) {
        ArrayList<Employee> filteredCustomers = new ArrayList();

        if (text.equals("")) {
            for (Employee employee : this.employees) {
                if (employee != null) {
                    filteredCustomers.add(employee);
                }
            }
            return filteredCustomers;
        } else {
            for (Employee employee : this.employees) {
                if (employee != null && employee.getId().toLowerCase().contains(text.toLowerCase())) {
                    filteredCustomers.add(employee);
                }
            }
            return filteredCustomers;
        }
    }
}
