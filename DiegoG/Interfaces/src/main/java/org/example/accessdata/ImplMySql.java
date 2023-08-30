package org.example.accessdata;

public class ImplMySql implements IAccessData{

    @Override
    public void insert() {
        System.out.println("Insertando datos en MySQL");
    }

    @Override
    public void show() {
        System.out.println("Listando datos en MySQL");
    }

    @Override
    public void update() {
        System.out.println("Actualizando datos en MySQL");
    }

    @Override
    public void delete() {
        System.out.println("Borrando datos en MySQL");
    }

}