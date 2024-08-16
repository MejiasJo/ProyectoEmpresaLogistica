/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

import java.time.LocalDate;
import people.Person;

/**
 *
 * @author zulay
 */
public class Employee extends Person {
    private String puesto;
    private double salario;

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Employee(String puesto, double salario, String identificacion, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        super(identificacion, nombre, fechaNacimiento, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
    }
     
    public Employee() {
    this("", 0.0, "", "", null, "", "");       
    }

    @Override
    public String toString() {
        return super.toString() + "puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
}