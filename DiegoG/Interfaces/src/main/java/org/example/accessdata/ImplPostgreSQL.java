package org.example.accessdata;

public class ImplPostgreSQL implements IAccessData {

    @Override
    public void insert() {
        System.out.println("Insertando datos en PostgreSQL");
    }

    @Override
    public void show() {
        System.out.println("Listando datos en PostgreSQL");
    }

    @Override
    public void update() {
        System.out.println("Actualizando datos en PostgreSQL");
    }

    @Override
    public void delete() {
        System.out.println("Borrando datos en PostgreSQL");
    }

}