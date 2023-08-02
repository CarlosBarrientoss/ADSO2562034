/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.EmployerMode;
import domain.PersonMode;
import domain.WordFinal;

public class WordFinalApp extends PersonMode{
    
    public static void main(String[] args) {
        PersonMode instance = new PersonMode();
        EmployerMode instance2 = new EmployerMode();
        
        
        instance.saludo("Hola");
        instance.saludo("Hola2");
    } 
    
}
