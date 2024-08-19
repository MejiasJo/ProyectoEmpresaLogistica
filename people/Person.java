/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import java.time.LocalDate;

/**
 *
 * @author zulay
 */
 public abstract class Person {
  private String id;
  private String name;
  private LocalDate birthDate;
  private String phone;
  private String email;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Person(String id, String name, LocalDate birthDate, String phone, String email) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
    this.phone = phone;
    this.email = email;
  }

  public Person() {
    this("", "", null, "", "");
  }

  @Override
  public String toString() {
    return "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone + ", email=" + email;
  }
}
