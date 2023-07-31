
package ciclosford;

import static ciclosford.CiclosFord.instancia2;


public class Principal {
   public static void main(String[] args){
       //CiclosFord instancia=new CiclosFord();
       
       //instancia.limite=5;
       //instancia.numerosPares();
       //System.out.println("instancia = " + instancia);
       CiclosFord.instancia2=new CiclosFord(12, 0, 0);
       instancia2.numerosPares();
       System.out.println("instancia2 = " + instancia2);
   }
}
