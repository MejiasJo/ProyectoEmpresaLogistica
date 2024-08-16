/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shipments;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Johel M
 */
public class ShipmentQueue {
    private Queue<Shipment> shipmentsQueue;

    public Queue<Shipment> getShipmentQueue() {
        return shipmentsQueue;
    }

    public ShipmentQueue() {
        shipmentsQueue = new LinkedList<>();
    }
    
    public void addShipment(Shipment shipment){
        this.shipmentsQueue.add(shipment);
    }
    
    public Shipment nextShipment(){
        return this.shipmentsQueue.poll();
    }

    @Override
    public String toString() {
        return "ShipmentQueue{ "+ shipmentsQueue.toArray().toString() + '}';
    }
     
}
