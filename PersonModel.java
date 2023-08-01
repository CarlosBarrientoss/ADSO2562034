/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author SENA
 */
public class PersonModel {

    
    private int idperson;
    private String name;
    private static int pesoncount;
    
  public PersonModel(int idperson, String name){
   this.idperson = idperson;
   this.name = name;
   PersonModel.pesoncount++;
  }

    public PersonModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static int getPesoncount() {
        return pesoncount;
    }

    public static void setPesoncount(int aPesoncount) {
        pesoncount = aPesoncount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonModel(");
        sb.append("idPerson");
        sb.append(", name = ");
        sb.append(")");
        return "PersonModel{" + "idperson=" + idperson + ", name=" + name + '}';
    }
    
  
  
}
