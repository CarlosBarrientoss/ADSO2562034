
package crud;

import java.util.List;
import java.util.Scanner;


public interface IList {
    
    public List<String> insertValue(List<String>listModel, Scanner in);
    void showList(List<String> listModel);
    void showListForE(List<String>listModel);
    void deleteFor(List<String>ListModel);
    void updateList(List<String>ListModel);

}
