/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

import packages.Package;
import java.util.HashMap;

/**
 *
 * @author munoz
 */
public class PackagesList {

    HashMap<Integer, Package> paquetes;

    public HashMap<Integer, Package> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(HashMap<Integer, Package> paquetes) {
        this.paquetes = paquetes;
    }

    public PackagesList() {
        paquetes = new HashMap<>();
    }

    public void AddPackage(Package paquete) {
        paquetes.put(paquete.getCode(), paquete);
    }

    public void UpdatePackage(int code, Package nuevosDatos) {
        if (paquetes.containsKey(code)) {
            AddPackage(nuevosDatos);
            System.out.println("Paquete actualizado exitosamente.");
        } else {
            System.out.println("No se encontró un paquete con el código ");
        }
    }

    public boolean DeletePackage(int code) throws TransitoException {
        Package packages = paquetes.get(code);
        if (packages != null) {
            if (packages.getState().equals(PackageStatus.Dispatched)) {
                throw new TransitoException();
            }else{
                paquetes.remove(code);
                return true;
            }
        }
        return false;
    }

    public Package SearchPackage(int code) {
        Package encontrado = paquetes.get(code);
        if (encontrado != null) {
            System.out.println("Paquete encontrado: ");
        } else {
            System.out.println("No se encontró un paquete con el código ");
        }
        return encontrado;
    }

    public HashMap<String, Package> filterPack(String description) {
        HashMap<String, Package> filterPack = new HashMap<>();
        for (Package paquete : paquetes.values()) {
            if (paquete.getDescription() != null && paquete.getDescription().toLowerCase().contains(description.toLowerCase())) {
                filterPack.put(paquete.getDescription(), paquete);
            }
        }
        return filterPack;
    }
}
