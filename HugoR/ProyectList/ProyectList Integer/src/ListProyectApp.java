import controller.ListController;
import models.ListModel;

import java.util.Scanner;

public class ListProyectApp {
    public static void main(String[] args) {
        ListController listController = new ListController();
        Scanner scanner = new Scanner(System.in);
        ListModel listModel = new ListModel();

        listController.insertValue(listModel.getListModel(), scanner);
        listController.showList(listModel.getListModel());
        listController.deleteList(listModel.getListModel());
        listController.showListForE(listModel.getListModel());
        listController.updateList(listModel.getListModel());

    }
}