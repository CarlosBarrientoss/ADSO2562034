package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListControllerString implements IListString {

    @Override
    public List<String> insertList(List<String> listModel, Scanner askList) {
        System.out.println("Ingrese la cantidad de valores que desea " +
                "ingresar en la lista: ");
        int amountList = askList.nextInt();
        for (int i = 0; i < amountList; i++) {
            System.out.println("Ingrese el valor: " + (i+1));
            listModel.add(askList.next());
        }
        return listModel;
    }

    @Override
    public void showList(List<String> listModel, Scanner askList) {
        listModel.forEach((countList -> System.out.println("El valor n° " + (listModel.indexOf(countList) + 1)
                + " ingresado es: " + countList)));
    }

    @Override
    public void deleteList(List<String> listModel, Scanner askList) {
        System.out.println("Introduce el valor que deseas borrar: ");
        Iterator<String> iterator = listModel.iterator();
        String askData = askList.next();
        while(iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase(askData)){
                listModel.remove(listModel.indexOf(askData));
                break;
            } else {
                System.out.println("No existe ese dato.");
            }
        }
        showList(listModel,askList);
    }

    @Override
    public void updateList(List<String> listModel, Scanner askList, ListModelString listModelString) {
        System.out.println("Introduce el valor que deseas actualizar: ");
        listModel.indexOf(askList.next());
        System.out.println("¿Cual valor nuevo deseas ingresar?: ");
        listModelString.setListModel(Collections.singletonList(askList.next()));
        showList(listModel,askList);
    }
}