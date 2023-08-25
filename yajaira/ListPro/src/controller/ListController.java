package controller;

import crud.IList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {

    public List<String> insertValue(List<String> listModel, Scanner in) {
        System.out.println("ingresando datos...");
        System.out.println("ingrese la cantidad de valores de la lista:\t");
        int tamanio = in.nextInt();

        for (int i = 0; i < tamanio; i++) {

            System.out.println("ingrese el valor:\t" + (i + 1) + ":");
            listModel.add(in.nextLine());
        }

        return listModel;
    }

    @Override
    public void showList(List<String> listModel) {
        Iterator<String> it = listModel.iterator();

        while (it.hasNext()) {
            System.out.println("Valor: " + it.next());
        }
    }

    @Override
    public void showListForE(List<String> listModel) {
        for (String num : listModel) {
            System.out.println("valor desde ForE: " + num);

        }

    }

    @Override
    public void deleteFor(List<String> ListModel) {

        for (String num : ListModel) {
            if (num.equals("ana")) {
                ListModel.remove(2);

            }
        }
    }

    public void deleteIterator(List<String> ListModel) {
        Iterator<String> it = ListModel.iterator();
        while (it.hasNext()) {

            if (it.next().equals("ana")) {
                it.remove();
            }

        }
    }

    @Override
    public void updateList(List<String> ListModel) {
        ListModel.set(4,"luz");
    }

}

