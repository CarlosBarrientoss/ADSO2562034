/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author SENA
 */
public class ClassString {
    
    private String name;
    private double salary;
    private int phone;
    
    
    public ClassString(String name, int phone, double salary){
     
    this.name = name;
    this.phone = phone;
    this.salary = salary;
    
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
    
    public String ToString(){
      return "person 1 name " + this.name + ", phone : " + this.phone + ", salary : " + this.salary + '1';
    }
    
}
