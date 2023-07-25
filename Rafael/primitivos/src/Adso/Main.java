package Adso;

public class Main {
    public static void main(String[] args) {
        byte numberByte =(byte) 128;
        System.out.println("El numero minimo del byte es: " + Byte.MIN_VALUE);
        System.out.println("El numero maximo del byte es : "+ Byte.MAX_VALUE);
        short numberShort = (short) 32767;
        System.out.println("El numero minimo del Short es : "+ Short.MIN_VALUE);
        System.out.println("El numero maximo del Short es : "+ Short.MAX_VALUE);
        int numberInt = (int) 2147483647;
        System.out.println("El numero minimo del Int es : "+ Integer.MIN_VALUE);
        System.out.println("El numero maximo del Int es : "+ Integer.MAX_VALUE);
        long numberLong = (long) 9223372036854775807L;
        System.out.println("El numero minimo del long es : "+ Long.MIN_VALUE);
        System.out.println("El numero maximo del long es : "+ Long.MAX_VALUE);
        float numberFloat = (float) 3.4028235E38;
        System.out.println("El numero minimo del float es: "+ Float.MIN_VALUE);
        System.out.println("El numero maximo del float es: "+ Float.MAX_VALUE);
        double numberDouble = (double) 1.7976931348623157E308;
        System.out.println("El numero minimo del double es: "+ Double.MIN_VALUE);
        System.out.println("El numero Maximo del double es: "+ Double.MAX_VALUE);
        char textChar = '\u0040';
        System.out.println(textChar);
        char character = '@';
        int unicodeCode = character;
        String unicodeFormat = String.format("\\u%04X", unicodeCode);
        System.out.println("El código Unicode de '@' en formato '\\uXXXX' es: " + unicodeFormat);


    }
}