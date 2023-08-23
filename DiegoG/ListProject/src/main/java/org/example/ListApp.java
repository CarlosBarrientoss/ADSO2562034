package org.example;

import java.util.Scanner;

public class ListApp {
    public static void main(String[] args) {

        ListControllerString listControllerString = new ListControllerString();
        ListControllerInteger listControllerInteger = new ListControllerInteger();
        ListModelInteger listModelInteger = new ListModelInteger();
        ListModelString listModelString = new ListModelString();
        Scanner askList = new Scanner(System.in);
        /*listControllerInteger.insertList(listModel.getListModel(),askList);
        listControllerInteger.showList(listModel.getListModel(),askList);
        listControllerInteger.deleteList(listModel.getListModel(),askList);
        listControllerInteger.updateList(listModel.getListModel(),askList);
         */
        listControllerString.insertList(listModelString.getListModel(),askList);
        listControllerString.showList(listModelString.getListModel(),askList);
        listControllerString.deleteList(listModelString.getListModel(),askList);
        listControllerString.updateList(listModelString.getListModel(),askList);
    }
}