package Model;

import java.util.List;

public class Student {

    private String name;
    private List<Double> listNotes;
    private Double noteFinal;

    public Student() {
    }

    public Student(String name, List<Double> listNotes, Double noteFinal) {
        this.name = name;
        this.listNotes = listNotes;
        this.noteFinal = noteFinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getListNotes() {
        return listNotes;
    }

    public void setListNotes(List<Double> listNotes) {
        this.listNotes = listNotes;
    }

    public Double getNoteFinal() {
        return noteFinal;
    }

    public void setNoteFinal(Double noteFinal) {
        this.noteFinal = noteFinal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", listNotes=" + listNotes +
                ", noteFinal=" + noteFinal +
                '}';
    }
}
