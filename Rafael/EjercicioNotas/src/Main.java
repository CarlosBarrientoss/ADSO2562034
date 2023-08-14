import Controller.StudentController;
import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("ronal");
        student.setNoteFinal(4.5);

        List<Double> notes = new ArrayList<>();
        notes.add(3.0);
        notes.add(4.5);
        notes.add(5.0);

        student.setListNotes(notes);

       // System.out.println("El 70% de las tres notas: " + StudentController.calculatePercentage70(student));
        System.out.println("La nota final es: " + StudentController.calculateNote(student));
    }
}
