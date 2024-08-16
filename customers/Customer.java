/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customers;

import java.time.LocalDate;
import java.util.logging.Logger;
import people.Person;

/**
 *
 * @author zulay
 */

 
public class Customer extends Person {
    private int age;

    public int getAge() {
        return age;
    }

    public Customer(int age, String id, String name, LocalDate birthDate, String phone, String email) {
        super(id, name, birthDate, phone, email);
        this.age = age;
    }

    public Customer() {
        this(0, "", "", null, "", "");
    }

    @Override
    public String toString() {
        return super.toString() + " age=" + age;
    }
}


