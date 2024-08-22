/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages;

/**
 *
 * @author munoz
 */
public class TransitoException extends Exception  {

     public TransitoException(String message) {
        super(message);
    }

    public TransitoException() {
        super("El paquete no puede ser eliminado porque está en tránsito.");
    }

}
