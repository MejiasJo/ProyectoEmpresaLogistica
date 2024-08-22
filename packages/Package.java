/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import packages.PackageStatus;
import customers.Customer;
;
/**
 *
 * @author munoz
 */
public class Package {
    private static int counter = 1;
    private int code;
    private String description;
    private double weight;
    private Customer sender;
    private Customer addressee;
    private PackageStatus status;

    public static int getCounter() {
        return counter;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public Customer getSender() {
        return sender;
    }

    public Customer getAddressee() {
        return addressee;
    }

    public PackageStatus getState() {
        return status;
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }
   
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddressee(Customer addressee) {
        this.addressee = addressee;
    }

    public void packegeIsNull() throws Exception{
        if(this==null)
            throw new Exception();
    }

    public Package(String description, double weight, Customer sender, Customer addressee) {
        this.code = counter ++;
        this.description = description;
        this.weight = weight;
        this.sender = sender;
        this.addressee = addressee;
        this.status = PackageStatus.InWarehouse;
    }

    public Package() {
        this("",0,new Customer() ,new Customer());
    }

    @Override
    public String toString() {
        return "Package{" + "code=" + code + ", description=" + description + ", weight=" + weight + ", sender=" + sender + ", addressee=" + addressee + ", status=" + status + '}';
    }
}
    