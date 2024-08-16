/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipments;

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

    @Override
    public String toString() {
        return "ShipmentHistory{ " + history.toString() + '}';
    }
     
}
