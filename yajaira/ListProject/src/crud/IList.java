
package crud;

import java.util.List;
import java.util.Scanner;


public interface IList {
    
    public List<Integer> insertValue(List<Integer>listModel, Scanner in);
    void showList(List<Integer> listModel);
    void showListForE(List<Integer>listModel);
    void deleteFor(List<Integer>ListModel);
    void updateList(List<Integer>ListModel);

}
