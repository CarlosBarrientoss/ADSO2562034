package primitivos;

public class Primitivos {

    public static void main(String[] args) {
        
        Byte numeroByte = 10;
        System.out.println("numeroByte =  " + numeroByte);
        System.out.println("maximo valor del byte =  " + Byte.MAX_VALUE);
        System.out.println("minimo valor del byte =  " + Byte.MIN_VALUE);
        
        short numeroShort = numeroByte;
        numeroByte = (byte)numeroShort;
        
        char numeroCh = 10;
        System.out.println("numeroChar =  " + numeroCh);
        System.out.println("maximo valor del char =  " + Character.MAX_VALUE);
        System.out.println("minimo valor del char =  " + Character.MIN_VALUE);
        
        int numeroIntt = numeroCh;
        numeroCh = (char)numeroIntt;
        
        short numeroS = 10;
        System.out.println("numeroShort =  " + numeroS);
        System.out.println("maximo valor del short =  " + Short.MAX_VALUE);
        System.out.println("minimo valor del short =  " + Short.MIN_VALUE);
        
        int numeroInt = numeroS;
        numeroS = (short)numeroInt;
        
        int numeroIn = 10;
        System.out.println("numeroInt =  " + numeroIn);
        System.out.println("maximo valor del int =  " + Integer.MAX_VALUE);
        System.out.println("minimo valor del int =  " + Integer.MIN_VALUE);
        
        float numeroFlo = numeroIn ;
        numeroIn = (int)numeroFlo;
        
        long numeroLon = 10;
        System.out.println("numeroLon =  " + numeroLon);
        System.out.println("maximo valor del Long =  " + Long.MAX_VALUE);
        System.out.println("minimo valor del Long =  " + Long.MIN_VALUE);
        
        float numeroFlot = numeroLon ;
        numeroLon = (long)numeroFlot;
        
        float numeroFl = 10;
        System.out.println("numerofloat =  " + numeroFl);
        System.out.println("maximo valor del float =  " + Float.MAX_VALUE);
        System.out.println("minimo valor del float =  " + Float.MIN_VALUE);
        
        double numeroDo = numeroFl ;
        numeroFl = (float)numeroDo;
        
        double numeroD = 10;
        System.out.println("numeroDOUBLE =  " + numeroD);
        System.out.println("maximo valor del double =  " + Double.MAX_VALUE);
        System.out.println("minimo valor del double =  " + Double.MIN_VALUE);
        
        
        
    }

}
