public class Adso {
    public static void main(String[] args) {
        byte numeroByte = (byte) 128;
        System.out.println("numeroByte " + numeroByte);
        System.out.println("Valor Minimo de byte " + Byte.MIN_VALUE);
        System.out.println("Valor Maximo de byte " + Byte.MAX_VALUE);
        
        short numeroShort = (short) 32768;
        System.out.println("numeroShort " + numeroShort);
        System.out.println("Valor Minimo de short " + Short.MIN_VALUE);
        System.out.println("Valor Maximo de short " + Short.MAX_VALUE);
        
        char numeroChar = '\u0031';
        System.out.println("numeroChar " + numeroChar);
        
        int numeroInt = (int)  2147483647;
        System.out.println("numeroInt " + numeroInt);
        System.out.println("Valor Minimo de int " + Integer.MIN_VALUE);
        System.out.println("Valor Maximo de int " + Integer.MAX_VALUE);
        
        long numeroLong = (long) 922;
        System.out.println("numeroLong " + numeroLong);
        System.out.println("Valor Minimo de long " + Long.MIN_VALUE);
        System.out.println("Valor Maximo de long " + Long.MAX_VALUE);
    }
}