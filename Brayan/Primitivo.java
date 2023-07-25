
public class Primitivo {

    public static void main(String[] args) {
        
        byte numeroByte = (byte) 128;
        System.out.println("numero Byte " + numeroByte);    
        System.out.println("valor minimo numero Byte " + Byte.MIN_VALUE);    
        System.out.println("valor maximo numero Byte " + Byte.MAX_VALUE);
        
        short numeroShort = (short) 32768;
        System.out.println("numero Byte " + numeroShort);    
        System.out.println("valor minimo numero Short " + Short.MIN_VALUE);    
        System.out.println("valor maximo numero Short " + Short.MAX_VALUE);
        
        char numeroChar = '\u0040';
        System.out.println("numero Char " + numeroChar);
                        
        int numeroInt = (int) 2147483647;
        System.out.println("numero Int " + numeroInt);
        System.out.println("valor minimo numero Long " + Integer.MIN_VALUE);    
        System.out.println("valor maximo numero Long " + Integer.MAX_VALUE);
                
        long numeroLong = (long) 9223372036854775807L;
        System.out.println("numero Byte " + numeroLong);    
        System.out.println("valor minimo numero Long " + Long.MIN_VALUE);    
        System.out.println("valor maximo numero Long " + Long.MAX_VALUE);
        
        float numeroFloat = (float) 3.4028235E38;
        System.out.println("numero Byte" + numeroFloat);    
        System.out.println("valor minimo numero Float " + Float.MIN_VALUE);    
        System.out.println("valor maximo numero Float " + Float.MAX_VALUE);
        
        double numeroDouble = (double) 1.7976931348623157E308;
        System.out.println("numero Byte" + numeroDouble);    
        System.out.println("valor minimo numero Double " + Double.MIN_VALUE);    
        System.out.println("valor maximo numero Double " + Double.MAX_VALUE);
    }
    
}