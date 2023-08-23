package Interface;

import java.util.List;
import java.util.Scanner;

public interface IList {
    public List<Integer> insertValue(List<Integer> listModel, Scanner in);
     void showList(List<Integer> show);
     void showListForE(List <Integer> show);
     void deleteFor(List <Integer> listModel);
     void deleteIterator(List<Integer> listModel);
     void updateList(List<Integer> listModel);
}
