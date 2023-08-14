package Controller;

import Model.Student;

import java.util.Scanner;

public class StudentController {

    public static Double calculateNote(Student student) {

        Double promedio = 0.0;

        for (Double note : student.getListNotes()) {
            promedio += note;
        }

        Double percentage70 = (promedio * 0.7) / student.getListNotes().size();
        Double percentage30 = student.getNoteFinal() * 0.3;
        Double result = percentage70 + percentage30;
        return result;
    }
    }

/*
    public static Double calculatePercentage(Student student) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que desea realizar calcular el 70% con opcion (1)");
        System.out.println("Que desea realizar calcular el 30% de la nota final con opcion (2)");

        Integer option = scanner.nextInt();
        Double result = 0D;

        if (1 == option) {
            result = calculatePercentage70(student);
        } else if (2 == option) {
            result = calculatePercentage30(student);
        }

        System.out.println("No digitaste una opcion valida");
        return result;
    }

    private static Double calculatePercentage30(Student student) {
        return student.getNoteFinal()*0.3;
    }

    private static Double calculatePercentage70(Student student) {
        Double promedio = 0.0;

        for (Double note: student.getListNotes()) {
            promedio += note;
        }

        return (promedio*0.7)/ student.getListNotes().size();
    }
}
*/