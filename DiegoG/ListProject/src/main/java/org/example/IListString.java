package org.example;

import java.util.List;
import java.util.Scanner;

public interface IListString {

    List<String> insertList(List<String> listModel, Scanner askList);
    void showList(List<String> listModel, Scanner askList);
    void deleteList(List<String> listModel, Scanner askList);
    void updateList(List<String> listModel, Scanner askList, ListModelString listModelString);

}