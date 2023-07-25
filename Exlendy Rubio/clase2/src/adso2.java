import javax.swing.*;

public class adso2 {
    public static void main(String[] args) {

        byte numByte = (byte) 128;
        System.out.println("num " + numByte);
        System.out.println("valor maximo"+ Byte.MAX_VALUE);
        System.out.println("valor minimo" +Byte.MIN_VALUE);

        int numInt = (int) 12345678;
        System.out.println("num " + numInt);
        System.out.println("valor maximo"+ Integer.MAX_VALUE);
        System.out.println("valor minimo" + Integer.MIN_VALUE);

        short numShort = (short) 1232;
        System.out.println("num " + numInt);
        System.out.println("valor maximo"+ Short.MAX_VALUE);
        System.out.println("valor minimo" + Short.MIN_VALUE);

        Long numLong = (Long) 789042563584444644L;
        System.out.println("num " + numLong);
        System.out.println("valor maximo"+ Long.MAX_VALUE);
        System.out.println("valor minimo" + Long.MIN_VALUE);

        char numChar = '\u0031';
        System.out.println("char" + numChar);

        float numFloat = (float) 1999.2000000000;
        System.out.println("num " + numLong);
        System.out.println("valor maximo"+Float.MAX_VALUE);
        System.out.println("valor minimo" +Float.MIN_VALUE);

        double numDouble = (Double) 170.999999;
        System.out.println("num " + numDouble);
        System.out.println("valor maximo"+Float.MAX_VALUE);
        System.out.println("valor minimo" +Float.MIN_VALUE);

    }
}