package org.example.accessdata;

public class ImplMongoDB implements IAccessData {

    @Override
    public void insert() {
        System.out.println("Insertando datos en MongoDB");
    }

    @Override
    public void show() {
        System.out.println("Listando datos en MongoDB");
    }

    @Override
    public void update() {
        System.out.println("Actualizando datos en MongoDB");
    }

    @Override
    public void delete() {
        System.out.println("Borrando datos en MongoDB");
    }

}