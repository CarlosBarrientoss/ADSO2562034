
package accesodatos;


public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando datos en Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos en Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos en Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos en Oracle");
    }
    
}
