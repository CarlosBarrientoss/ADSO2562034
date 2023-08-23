import Controller.ListController;
import Model.ListModel;

import java.util.List;
import java.util.Scanner;

public class ProjectListStringApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListModel listModel = new ListModel();
        ListController listController = new ListController();
        List<String> list = listController.insertValue(listModel.getListModel(), in);
        listController.showList(list);
        listController.showListForE(list);
        //listController.deleteFor(list);
        listController.deleteIterator(list);
        listController.showListForE(list);
        listController.updateList(list);
        listController.showListForE(list);
    }
}
