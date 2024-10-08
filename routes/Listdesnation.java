/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package routes;

import java.util.HashSet;

/**
 *
 * @author DannyTini
 */
public class Listdesnation extends Route {

    private HashSet<Route> routes;

    public Listdesnation() {
        routes = new HashSet<>();
    }
    
    public void addRount(Route rount) {
        routes.add(rount);
    }

    public void deleteRoute(int code) {
        for (Route route : routes) {
            if (route.getCode() == code) {
                routes.remove(route);
                break;
            }
        }
    }
    public Route searchRoute(int code) {
        for (Route route : routes) {
            if (route.getCode() == code) {
                return route;
            }
        }
        return null;
    }
    
     public boolean updateRout(Route rountes) {
        if (routes.contains(rountes)) {
            routes.remove(rountes);
            routes.add(rountes);
            return true;
        }
        return false;
    }
    
    public Route[] filterRoutes(String description) {
       
        HashSet<Route> filteredRoutes = new HashSet<>();
        for (Route route : routes) {
            if (route.getDescription() != null && route.getDescription().toLowerCase().contains(description.toLowerCase())) {
                filteredRoutes.add(route);
            }
        } 
        Route[] result = new Route[filteredRoutes.size()];
        return filteredRoutes.toArray(result);
    }
    
    
    }

