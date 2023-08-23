package Controller;

import Interface.InterfaceList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListController implements InterfaceList {
    @Override
    public List<String> insertValue(List<String> listModel, Scanner in) {
        System.out.println("Ingresando datos...");
        System.out.println("Ingrese la cantidad de valores de la lista:\t");
        int size = in.nextInt();
        Scanner palabra = new Scanner(System.in);
        for (int i = 0; i < size; i++){
            System.out.println("Ingrese la palabra:\t"+(i+1)+ ";");
            listModel.add(palabra.nextLine());
        }
        return listModel;
    }
    @Override
    public void showList(List<String> show) {
        Iterator<String> it = show.iterator();

        while(it.hasNext()){
            System.out.println("Palabra: "+ it.next());
        }
    }
    @Override
    public void showListForE(List<String> show) {
        show.forEach(System.out::println);
        for(String word : show){
            System.out.println("Palabra desde forEach: "+ word);
        }
    }
    @Override
    public void deleteFor(List<String> listModel){
        for(String word : listModel){
            if( word.equals("banana")){
                listModel.remove(2);
            }
        }
    }
    @Override
    public void deleteIterator(List<String> listModel){
        Iterator<String> it = listModel.iterator();
        while(it.hasNext()){
            String word = it.next();

            if(word.equals("manzana")){
                it.remove();
            }
        }
    }
    @Override
    public void updateList(List<String> listModel){
        listModel.set(2,"Pera");
    }
}
