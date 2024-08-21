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

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean updateCustomer(Customer customer) {
        int index = customers.indexOf(customer);
        if (index !=-1) {
            customers.set(index, customer);
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
    
    public ArrayList<Customer> filteredCustomers(String text) {
        ArrayList<Customer> filteredCustomers = new ArrayList();

        if (text.equals("")) {
            for (Customer custom : this.customers) {
                if (custom != null) {
                    filteredCustomers.add(custom);
                }
            }
            return filteredCustomers;
        } else {
            for (Customer custom : this.customers) {
                if (custom != null && custom.getId().toLowerCase().contains(text.toLowerCase())) {
                    filteredCustomers.add(custom);
                }
            }
            return filteredCustomers;
        }
    }
}
