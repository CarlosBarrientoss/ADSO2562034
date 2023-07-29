package Adso;

public class Adso {

    public static void main(String[] args) {
        //byte 
        //valor maximo -128 y valor maximo 127
        byte numeroByte = (byte) 128;
        System.out.println("numeroByte =  " + numeroByte);
        System.out.println("valor maximo " + Byte.MIN_VALUE);
        System.out.println("valor maximo " + Byte.MAX_VALUE);

        //short
        //valor maximo -32768 y valor maximo 32767
        short numeroShort = (short) 0;
        System.out.println("numeroShort =  " + numeroShort);
        System.out.println("valor maximo " + Short.MIN_VALUE);
        System.out.println("valor maximo " + Short.MAX_VALUE);
        //char
        // 
        char numeroChar = (char) 0;
        System.out.println("numeroChar =  " + numeroChar);
        System.out.println("valor maximo " + Character.MIN_VALUE);
        System.out.println("valor maximo " + Character.MAX_VALUE);

        //int
        // valor maximo -2147483648 y valor maximo 2147483647
        int numeroInt = (int) 0;

        System.out.println("numeroInt =  " + numeroInt);
        System.out.println("valor maximo " + Integer.MIN_VALUE);
        System.out.println("valor maximo " + Integer.MAX_VALUE);

        //long
        //valor maximo -9223372036854775808 y valor maximo 9223372036854775807
        long numeroLong = (long) 0;

        System.out.println("numeroLong =  " + numeroLong);
        System.out.println("valor maximo " + Long.MIN_VALUE);
        System.out.println("valor maximo " + Long.MAX_VALUE);

        //float
        //valor maximo 1.4E-45 valor maximo 3.4028235E38
        float numeroFloat = (float) 0;

        System.out.println("numeroFloat =  " + numeroFloat);
        System.out.println("valor maximo " + Float.MIN_VALUE);
        System.out.println("valor maximo " + Float.MAX_VALUE);
        //double
        // valor maximo 4.9E-324 y valor maximo 1.7976931348623157E308
        double numeroDouble = (double) 0;
        System.out.println("numeroDouble =  " + numeroDouble);
        System.out.println("valor maximo " + Double.MIN_VALUE);
        System.out.println("valor maximo " + Double.MAX_VALUE);

    }

}
