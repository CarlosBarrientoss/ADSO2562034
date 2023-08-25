
import controller.ListController;
import java.util.Scanner;
import models.ListModel;


public class ListProjectApp {
    public static void main(String[] args) {
        ListController listController = new ListController();
        Scanner in = new Scanner(System.in);
        ListModel listModel = new ListModel();
        listController.insertValue(listModel.getListModel(), in);
        //listController.showList(listModel.getListModel());
        listController.showListForE(listModel.getListModel());
        //listController.deleteIterator(listModel.getListModel());
        listController.updateList(listModel.getListModel());
        listController.showListForE(listModel.getListModel());
    }
}
