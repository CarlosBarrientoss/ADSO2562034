package domain;

import domain.PersonModel;

public class EmployeeModel extends PersonModel{
    @Override
    public void saludar(){
        System.out.println("Clase hijo");
    }

}