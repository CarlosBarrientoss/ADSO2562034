package controller;

import crud.IList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {

    public List<Integer> insertValue(List<Integer> listModel, Scanner in) {
        System.out.println("ingresando datos...");
        System.out.println("ingrese la cantidad de valores de la lista:\t");
        int tamanio = in.nextInt();

        for (int i = 0; i < tamanio; i++) {

            System.out.println("ingrese el valor:\t" + (i + 1) + ":");
            listModel.add(in.nextInt());
        }

        return listModel;
    }

    @Override
    public void showList(List<Integer> listModel) {
        Iterator<Integer> it = listModel.iterator();

        while (it.hasNext()) {
            System.out.println("Valor: " + it.next());
        }
    }

    @Override
    public void showListForE(List<Integer> listModel) {
        for (Integer num : listModel) {
            System.out.println("valor desde ForE: " + num);

        }

    }

    @Override
    public void deleteFor(List<Integer> ListModel) {

        for (Integer num : ListModel) {
            if (num == 3) {
                ListModel.remove(2);

            }
        }
    }

    public void deleteIterator(List<Integer> ListModel) {
        Iterator<Integer> it = ListModel.iterator();
        while (it.hasNext()) {

            if (it.next() == 3) {
                it.remove();
            }

        }
    }

    @Override
    public void updateList(List<Integer> ListModel) {
        ListModel.set(4,1000);
    }

}
