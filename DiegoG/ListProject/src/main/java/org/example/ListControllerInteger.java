package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListControllerInteger implements IListInteger {

    @Override
    public List<Integer> insertList(List<Integer> listModel, Scanner askList) {
        System.out.println("Ingrese la cantidad de valores que desea " +
                "ingresar en la lista: ");
        int amountList = askList.nextInt();
        for (int i = 0; i < amountList; i++) {
            System.out.println("Ingrese el valor: " + (i+1) );
            listModel.add(askList.nextInt());
        }
        return listModel;
    }

    @Override
    public void showList(List<Integer> listModel, Scanner askList) {
        listModel.forEach((countList -> System.out.println("El valor n° " + (listModel.indexOf(countList) + 1)
                + " ingresado es: " + countList)));
    }

    @Override
    public void deleteList(List<Integer> listModel, Scanner askList){
        System.out.println("Introduce el valor que deseas borrar: ");
        Iterator<Integer> iterator = listModel.iterator();
        int askNumber = askList.nextInt();
        while(iterator.hasNext()){
            if(iterator.next() == askNumber){
                listModel.remove(listModel.indexOf(askNumber));
                break;
            } else {
                System.out.println("No existe ese dato.");
            }
        }
        showList(listModel,askList);
    }

    @Override
    public void updateList(List<Integer> listModel, Scanner askList){
        System.out.println("Introduce el valor que deseas actualizar: ");
        listModel.indexOf(askList.nextInt());
        System.out.println("¿Cual valor nuevo deseas ingresar?: ");
        listModel.add(askList.nextInt());
        showList(listModel,askList);
    }
}