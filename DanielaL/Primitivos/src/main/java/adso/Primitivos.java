package adso;

public class Primitivos {

    public static void main(String[] args) {
        byte numeroByte = (byte) 128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte " + Byte.MAX_VALUE);
        
        short numeroShort = (short) 32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        
        int numeroInt = (int) 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de Int: " + Integer.MAX_VALUE);
        
        long numeroLong = (long) 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo de Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de Long: " + Long.MAX_VALUE);
        
        float numeroFloat = (float) 3.402823e38;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
        
        double numeroDouble = (double) 	1.79769313486232e30;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
        
        char numeroChar = (char)'\u0031';
        System.out.println("numeroChar = "+numeroChar);        
    }
}