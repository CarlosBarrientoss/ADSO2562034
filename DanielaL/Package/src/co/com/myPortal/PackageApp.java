package co.com.myPortal;

import co.com.myPortal.domain.ClassPackage;

public class PackageApp {
    public static void main(String[] args) {
        ClassPackage instance1 = new ClassPackage();
        instance1.imprimir("Hola mundo");
        instance1.saludar();
    }
}