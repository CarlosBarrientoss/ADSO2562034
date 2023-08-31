package AccesoDatos;

public class ImplementacionMysql implements  IAccesoDatos{


    @Override
    public void insertar() {
        System.out.println("Insertando datos en Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos en Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos en Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos en Mysql");
    }
}
