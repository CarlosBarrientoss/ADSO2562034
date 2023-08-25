package controller;

import crud.IList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {

    @Override
    public List<String> insertValue(List<String> listModel, Scanner in) {
        System.out.println("ingresando datos...");
        System.out.println("ingrese la cantidad de valores de la lista:\t");
        int tamanio = in.nextInt();
        for (int i = 0; i < tamanio; i++) {
            System.out.print("ingrese el valor " + (i + 1) + ": ");
            listModel.add(in.nextLine());

        }
        return listModel;
    }

    @Override
    public void showList(List<String> listModel) {
        Iterator<String> it = listModel.iterator();
        while (it.hasNext()) {
            System.out.println("valor: " + it.next());
        }
    }

    @Override
    public void showListForE(List<String> listModel) {
        for (String num : listModel) {
            System.out.println("valor desde ForE: " + num);
        }
    }

    @Override
    public void deleteFor(List<String> listModel) {
        for (String num : listModel) {
            if (num == "luisa") {
                listModel.remove(2);
            }
        }
    }

    @Override
    public void deleteIterator(List<String> listModel) {
        Iterator<String> it = listModel.iterator();
        while (it.hasNext()) {

            if (it.next().equals("luisa")) {
                it.remove();

            }

        }
    }

    @Override
    public void updateList(List<String> listModel) {
        listModel.set(4, "andres");

    }

    

}
