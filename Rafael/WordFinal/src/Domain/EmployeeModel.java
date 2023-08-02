package Domain;

import Domain.PersonModel;
public class EmployeeModel extends PersonModel{
    @Override
    public void saludo(){
        System.out.println("Clase hija");
    }
}
