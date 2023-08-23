
import controller.ListController;
import crud.IList;
import java.util.List;
import java.util.Scanner;
import models.ListModel;


public class ListProjectApp {
    public static void main(String[] args) {
        ListController listcontroler = new  ListController();
        ListModel listModel = new  ListModel();
        Scanner in=new Scanner(System.in);
        
        
        listcontroler.insertar(listModel.getListModel(), in);
       // listcontroler.listar(listModel.getListModel());
      //  listcontroler.actualizar(listModel.getListModel() );
        listcontroler.listar(listModel.getListModel());
        listcontroler.eliminar(listModel.getListModel());
         listcontroler.listar(listModel.getListModel());
        
}      
}











