import AccesoDatos.*;

public class PrincipalApps {
    public static void main(String[] args) {
        IAccesoDatos mysql = new ImplementacionMysql();
        mysql.insertar();
        IAccesoDatos postgresql  = new ImplementacionPostgreSql();
        postgresql.insertar();
        IAccesoDatos mongodb = new ImplementacionMongoDB();
        mongodb.insertar();
        IAccesoDatos oracle = new ImplementandoOracle();
        oracle.insertar();

        IAccesoDatos datos = new ImplementacionMysql();
        insertarGenerico(datos);                                     //datos.insertar();
        datos = new ImplementandoOracle();
        insertarGenerico(datos);                                     //datos.insertar();
        datos = new ImplementacionPostgreSql();
        insertarGenerico(datos);                                     //datos.insertar();
        datos= new ImplementacionMongoDB();
        insertarGenerico(datos);                                     //datos.insertar();
    }


    public static void insertarGenerico (IAccesoDatos dato){
        //polimorfismo
        dato.insertar();
    }
}