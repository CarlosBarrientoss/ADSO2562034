package Controller;

import Interface.IList;
import Model.ListModel;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements IList {


    @Override
    public List<Integer> insertValue(List<Integer> listModel, Scanner in) {
        System.out.println("Ingresando datos...");
        System.out.println("Ingrese la cantidad de valores de la lista:\t");
        int size = in.nextInt();

        for (int i = 0; i < size; i++){
            System.out.println("Ingrese el valor:\t"+(i+1)+ ";");
            listModel.add(in.nextInt());
        }
        return listModel;
    }

    @Override
    public void showList(List<Integer> show) {
        Iterator<Integer> it = show.iterator();

        while(it.hasNext()){
            System.out.println("Valor: "+ it.next());
        }
    }
    @Override
    public void showListForE(List<Integer> show) {
        show.forEach(System.out::println);
        for(Integer num : show){
            System.out.println("Valor desde forEach"+ num);
        }
    }

    @Override
    public void deleteFor(List<Integer> listModel){
        for(Integer num : listModel){
            if( num == 3){
                listModel.remove(2);
            }
        }
    }
    @Override
    public void deleteIterator(List<Integer> listModel){
        Iterator<Integer> it = listModel.iterator();
        while(it.hasNext()){
            Integer num = it.next();

            if(num == 3){
                it.remove();
            }
        }
    }
    @Override
    public void updateList(List<Integer> listModel){
        listModel.set(2,8);
    }
}
