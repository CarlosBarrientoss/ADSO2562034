
package crud;

import java.util.List;
import java.util.Scanner;


public interface IList {
   public List<String> insertValue(List<String>listModel,Scanner in);
    public void showList(List<String> listModel);
    void showListForE(List<String>listModel);
    void deleteFor(List<String>listModel);
    void deleteIterator(List<String>listModel);
    void updateList(List<String>listModel);
}  

