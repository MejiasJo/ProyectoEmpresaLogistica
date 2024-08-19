/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customers;

import java.time.LocalDate;
import java.time.Period;
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

   public Customer(String id, String name, LocalDate birthDate, String phone, String email) {
        super(id, name, birthDate, phone, email);
        updateAge(birthDate);
    }

    public Customer() {
        this("", "", null, "", "");
    }

    public void updateAge(LocalDate birthDate) {
        if (birthDate == null) {
            this.age = 0;
        } else if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede estar en el futuro");
        } else {
            this.age = Period.between(birthDate, LocalDate.now()).getYears();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " age=" + age;
    }
}


