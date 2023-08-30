package org.example.accessdata;

public class ImplOracleDB implements IAccessData{

    @Override
    public void insert() {
        System.out.println("Insertando datos en OracleDB");
    }

    @Override
    public void show() {
        System.out.println("Listando datos en OracleDB");
    }

    @Override
    public void update() {
        System.out.println("Actualizando datos en OracleDB");
    }

    @Override
    public void delete() {
        System.out.println("Borrando datos en OracleDB");
    }

}