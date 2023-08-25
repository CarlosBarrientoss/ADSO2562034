package controller;

import crud.IList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {

    @Override
    public List<Integer> insertValue(List<Integer> listModel, Scanner in) {
        System.out.println("ingresando datos...");
        System.out.println("ingrese la cantidad de valores de la lista:\t");
        int tamanio = in.nextInt();
        for (int i = 0; i < tamanio; i++) {
            System.out.print("ingrese el valor " + (i + 1) + ": ");
            listModel.add(in.nextInt());

        }
        return listModel;
    }

    @Override
    public void showList(List<Integer> listModel) {
        Iterator<Integer> it = listModel.iterator();
        while (it.hasNext()) {
            System.out.println("valor: " + it.next());
        }
    }

    @Override
    public void showListForE(List<Integer> listModel) {
        for (Integer num : listModel) {
            System.out.println("valor desde ForE: " + num);
        }
    }

    @Override
    public void deleteFor(List<Integer> listModel) {
       for (Integer num:listModel){
           if (num==3){
               listModel.remove(2);
           }
       }
    }

    @Override
    public void deleteIterator(List<Integer> listModel) {
        Iterator<Integer>it=listModel.iterator();
        while (it.hasNext()){
           
            if(it.next()==3){
              it.remove();
                
            }
            
        }
    }

    @Override
    public void updateList(List<Integer> listModel) {
        listModel.set(4, 1000);
        
    }

}
