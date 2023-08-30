
package accesodatos;


public class ImplementacionPostgreSql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos en PostgreSql");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos en PostgreSql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos en PostgreSql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos en PostgreSql");
    }
    
}
