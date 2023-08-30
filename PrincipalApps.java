
import accesodatos.AccesoDatos;
import accesodatos.ImplementacionMongoDB;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;
import accesodatos.ImplementacionPostgreSql;


public class PrincipalApps {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        insertarGenerico(datos);
        
        datos = new ImplementacionOracle();
        insertarGenerico(datos);
        
        datos = new ImplementacionMongoDB();
        insertarGenerico(datos);
        
        datos = new ImplementacionPostgreSql();
        insertarGenerico(datos);
    }
    
    public static void insertarGenerico (AccesoDatos dato){
        //poliformismos
        dato.insertar();
    }
}
