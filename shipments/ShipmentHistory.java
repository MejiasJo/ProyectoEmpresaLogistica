/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipments;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Johel M
 */
public class ShipmentHistory {
    private HashMap<Integer,Shipment> history;

    public HashMap<Integer, Shipment> getHistorial() {
        return history;
    }

    public ShipmentHistory() {
        history = new HashMap();
    }
    
    public void addShipment(Shipment shipment){
        history.put(shipment.getShipmentNumber(), shipment);
    }
    
    public Shipment searchShipment(int key){
        return history.get(key);
    }
    
    public ArrayList<Shipment> filteredShipment(String text) {
        ArrayList<Shipment> filteredCustomers = new ArrayList<>();

        if (text.equals("")) {
            for (Shipment shipment : this.history.values()) {
                if (shipment != null) {
                    filteredCustomers.add(shipment);
                }
            }
            return filteredCustomers;
        } else {
            for (Shipment shipment : this.history.values()) {
                if (shipment != null && shipment.getShipmentNumber()== Integer.parseInt(text.toLowerCase())) {
                    filteredCustomers.add(shipment);
                }
            }
            return filteredCustomers;
        }
    }

    @Override
    public String toString() {
        return "ShipmentHistory{ " + history.toString() + '}';
    }
     
}
