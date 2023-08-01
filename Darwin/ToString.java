import domain.ClassString;

public class ToString {
    public static void main(String[] args){
        ClassString personl = new ClassString("Elon musk",31235838,1414);
       
        System.out.println(" nombre person1: "+ personl.getName());
        System.out.println(" nombre personl: "+ personl.getPhone());
        System.out.println(" nombre personal: "+personl.getSalary());
}

}