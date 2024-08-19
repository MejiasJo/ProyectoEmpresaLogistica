/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zulay
 */
public class CustomerList {
    private List<Customer> customers;

    public CustomerList() {
        customers = new ArrayList<>();
    }

    public void addCustomer(String id, String name, LocalDate birthDate, String phone, String email) {
        Customer newCustomer = new Customer(id, name, birthDate, phone, email);
        customers.add(newCustomer);
    }

    public boolean updateCustomer(String id, String newPhone, String newEmail) {
        Customer customer = findCustomerById(id);
        if (customer != null) {
            customer.setPhone(newPhone);
            customer.setEmail(newEmail);
            return true;
        }
        return false;
    }

    public boolean removeCustomer(String id) throws Exception {
        Customer customer = findCustomerById(id);
        if (customer != null) {
            if (hasPackagesInTransit(id)) {
                throw new Exception("No se puede eliminar al cliente con paquetes en tránsito");
            }
            customers.remove(customer);
            return true;
        }
        return false;
    }

    public Customer findCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    public void listAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    private boolean hasPackagesInTransit(String id) {
        // Aquí se debería implementar la lógica para verificar si el cliente tiene paquetes en tránsito.
        return false;
    } 
}
