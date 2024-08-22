/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipments;

import customers.Customer;
import packages.PackageStatus;
import packages.Package;
import routes.Route;
import java.time.LocalDate;

/**
 *
 * @author Johel M
 */
public class Shipment {
    private static int counter = 1;
    private final int FIRST_KILO_COST = 2100, EXTRA_KILO_COST = 1200;
    private int shipmentNumber;
    private Customer client;
    private Package pack;
    private Route route;
    private LocalDate shipmentDate;
    private LocalDate deliveryDate;
    private double price;

    public int getShipmentNumber() {
        return shipmentNumber;
    }

    public Customer getClient() {
        return client;
    }

    public Package getPack() {
        return pack;
    }

    public Route getRoute() {
        return route;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Shipment(Customer client, Package pack, Route route) {
        this.shipmentNumber = counter++;
        this.client = client;
        this.pack = pack;
        this.route = route;
        this.shipmentDate = LocalDate.now();
        this.deliveryDate = null;
        this.price = calculatePrice(pack);
    }
    
    public Shipment() {
        this(new Customer(), new Package(), new Route());
    }
    
    public double calculatePrice(Package pack) {
        double cost = this.FIRST_KILO_COST;
        if(pack.getWeight()>1)
            cost += (pack.getWeight() - 1) * this.EXTRA_KILO_COST;
        return cost;
    }
    
    public void dispatchShipment(Package pack) throws Exception{
        if (pack.getState()== PackageStatus.InWarehouse){
            this.pack.setStatus(PackageStatus.Dispatched);
        } else {throw new Exception();}
    }
    
    public void deliverShipment(Package pack) throws Exception {
        if (pack.getState() == PackageStatus.Dispatched){
            this.pack.setStatus(PackageStatus.Delivered);
            setDeliveryDate(LocalDate.now());
        } else {throw new Exception();}
    }
    
    public void cancelShipment(Package pack) throws Exception {
        if (pack.getState() == PackageStatus.InWarehouse){
            this.pack.setStatus(PackageStatus.Canceled);
        } else {throw new Exception();}
    }

    @Override
    public String toString() {
        return "Shipment{" + "shipmentNumber= " + shipmentNumber + ", customer= " + client + 
                 ", package= " + pack + ", route= " + route + ", shipmentDate= " + 
                   shipmentDate + ", deliveryDate= " + deliveryDate + ", price= " + price + '}';
    }
}
