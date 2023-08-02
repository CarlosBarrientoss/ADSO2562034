package org.example;

import org.example.domain.EmployeeModel;
import org.example.domain.PersonModel;

public class WordFinalApp {

    public static void main(String[] args) {

        PersonModel personModel = new PersonModel();
        EmployeeModel employeeModel = new EmployeeModel();
        personModel.salute();
        employeeModel.salute();

    }
}