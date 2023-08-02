package domain;

import domain.PersonModel;
public class EmployeeModel extends PersonModel {
    @Override
    public void saludo(){
        System.out.println("Hola desde la clase Hija");
    }

}
