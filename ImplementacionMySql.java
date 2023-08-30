
package accesodatos;


public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos en MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos en MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos en MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos en MySql");
    }
    
    
    
}
