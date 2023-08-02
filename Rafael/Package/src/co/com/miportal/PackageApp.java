package co.com.miportal;

//import co.com.miportal.domain.ClassPackage;

public class PackageApp {
    public static void main(String[] args) {
        //ClassPackage instance1 = new ClassPackage();
        //instance1.imprimir("Hola mundo instancia");

        //ClassPackage.imprimir("Hola mundo");
        //ClassPackage.saludar();

        co.com.miportal.domain.ClassPackage.saludar("Hola desde un nombre calificado en el metodo principal");
    }
}
