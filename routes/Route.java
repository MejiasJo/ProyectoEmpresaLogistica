  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routes;

import java.util.HashSet;

/**
 *
 * @author DaniTini
 */
public class Route {

    private static int count = 1;
    private int code;
    private String name;
    private String description;
    HashSet<String> destinationList;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<String> getDestinationList() {
        return destinationList;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDestinationList(HashSet<String> destinationList) {
        this.destinationList = destinationList;
    }

    public Route(String name, String description) {
        this.code = count++;
        this.name = name;
        this.description = description;
        this.destinationList = new HashSet();

    }

    public Route() {
        this("", "");
    }

    public void addDestiny(String destiny) {
        destinationList.add(destiny);
    }

    public String searchDestiny(String destiny) {
        if (destiny != null) {
            for (String Destiny : destinationList) {
                if (Destiny.equals(destiny)) {
                    return destiny;
                }
            }
        }
        return null;
    }

    
    @Override
    public String toString() {
        return "Route{" + "code=" + code + ", name=" + name + ", description=" + description + ", destinationList=" + destinationList.toString() + '}';
    }       
}
