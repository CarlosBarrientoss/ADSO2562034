package org.example;

import org.example.domain.PersonModel;

public class EncapsulationApp {
    public static void main(String[] args) {

        PersonModel instancePerson = new PersonModel("Carlos", 5000000, true);
        System.out.println(instancePerson.getName() + "\n" + instancePerson.getSalary()
                + "\n" + instancePerson.isStatus());

    }
}