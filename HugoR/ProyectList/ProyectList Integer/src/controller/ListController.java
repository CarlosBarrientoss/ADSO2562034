package controller;

import crud.IList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {
    @Override
    public List<Integer> insertValue(List<Integer> listModel, Scanner in){
        System.out.println("Ingresando datos:");
        System.out.println("Ingrese la cantidad de valores a la lista: ");
        int tamanio = in.nextInt();

        for(int i= 0; i< tamanio; i++){
            System.out.println("Ingrese el valor:\t" + (i+1)+ ":");
            listModel.add(in.nextInt());
        }



        return listModel;
    }

    public void showList(List<Integer> listModel){ //showList
        //showList.forEach(System.out::println);
        Iterator<Integer> it = listModel.iterator();
        while(it.hasNext()){
            System.out.println("Valor: " + it.next());
        }
    }

    public void showListForE(List<Integer> listModel){
        for (Integer num : listModel){
            System.out.println("Valor desde ForE: "+ num);
        }
    }

    public void deleteList(List<Integer> listModel){
        Iterator<Integer> it = listModel.iterator();

        while (it.hasNext()){

            if (it.next() == 3) {
                it.remove();
            }
        }


        //for(Integer num : listModel){
        //    if(num==3){
        //        listModel.remove(2);//NO SE PUEDE!
        //    }
        //}


    }


    public void updateList(List<Integer> listModel) {
        listModel.set(3,6);
    }
}
