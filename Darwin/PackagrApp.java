
package co.com.miportal;

import co.com.miportal.domain.ClassPackage;

public class PackagrApp {
    public static void main(String[] args){
        
        ClassPackage instance1 = new ClassPackage();
        
        ClassPackage.saludar();
        
        ClassPackage.imprimir("hola mundo");
      
         co.com.miportal.domain.ClassPackage.saludar(" hola desde un nombre calificado desde el metodo pricipal");
    
        
        
       // ClassPackage.imprimir("Hola mundo");
        
    }
    
}
