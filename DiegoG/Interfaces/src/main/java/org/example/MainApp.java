package org.example;

import org.example.accessdata.*;

public class MainApp {
    public static void main(String[] args) {

        IAccessData accessDataMySQL = new ImplMySql();
        IAccessData accessDataMongoDB = new ImplMongoDB();
        IAccessData accessDataImplOracleDB = new ImplOracleDB();
        IAccessData accessDataPostgreSQL = new ImplPostgreSQL();

    }

    public static void insertData(IAccessData accessData){
        accessData.insert();
    }

}