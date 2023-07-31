package main;

import encapsulationapp.PersonModel;

public class EncapsulacionApp {
    public static void main(String[] args) {
            PersonModel instancia2 = new PersonModel("juan",1000,true);
    instancia2.getName();
        System.out.println("Nombre" +instancia2.getName());
    }
    

}
