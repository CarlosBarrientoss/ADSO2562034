
package matrices;

import java.util.Scanner;


public class matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de estudiantes ");  
         int numberStudents = sc.nextInt();
         
         System.out.println("Ingrese el numero de  materias ");
         int numberMatters = sc.nextInt();
         
         String[][] rating = new String[numberStudents][numberMatters +1];
         
         
         for (int i = 0; i < numberStudents; i++) {
             System.out.println("ingresa el nombre del estudiante "+ ( i +1)+ ":");
             rating [i][0]= sc.next();
             
             for (int j = 1; j <= numberMatters; j++) {
                 
                 System.out.println("ingresa la calificacion de la materia  "+j+ " del estudiante "+rating[i][0]+ ":");
                 rating[i][j]=sc.next();
             }
        }
         System.out.print("las calificaciones son ");
         for (int i = 0; i < numberStudents; i++) {
             System.out.print(rating[i][0]+ ":");
             for (int j = 0; j <=numberMatters; j++) {
                 System.out.print(rating[i][j]);
                 
                 
             }
            
        }
    }
    
}
