public class Primitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        byte numeroByte = (byte) 128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo de byte. " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short) 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de byte. " + Short.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Short.MAX_VALUE);
        
        
        char numeroChar = '\u0000';
        System.out.println("numero Char = " + numeroChar);
       
        
        int numeroInt = 2147483647 ;
        System.out.println("numero Int = " + numeroInt);
    
        
        long numeroLong = (long) 922337203685807L ;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de byte. " + Long.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Long.MAX_VALUE);
        
        float numeroFloat = (float) 3.4028235E38 ;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo de byte. " + Float.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Float.MAX_VALUE);
        
        double numeroDouble = (double) 1.79769313486231570E+308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de byte. " + Double.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Double.MAX_VALUE);
        
    }
    
}

    
    