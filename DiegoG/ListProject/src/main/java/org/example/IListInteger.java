package org.example;

import java.util.List;
import java.util.Scanner;

public interface IListInteger {

    List<Integer> insertList(List<Integer> listModel, Scanner askList);
    void showList(List<Integer> listModel, Scanner askList);
    void deleteList(List<Integer> listModel, Scanner askList);
    void updateList(List<Integer> listModel, Scanner askList);

}