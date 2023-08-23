package Interface;

import java.util.List;
import java.util.Scanner;

public interface InterfaceList {
    List<String> insertValue(List<String> listModel, Scanner in);
    void showList(List<String> show);
    void showListForE(List <String> show);
    void deleteFor(List <String> listModel);
    void deleteIterator(List<String> listModel);
    void updateList(List<String> listModel);
}
