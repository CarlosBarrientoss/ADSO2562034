import java.util.Scanner;

public class Condicionales {

    public static void condicionalIf(){
        var num1 = 10;
        var num2 = 20;
        var num3 = 30;

        if(num2 < num3){
            System.out.println("el numero 3 es mayor  " + num3 );
        } else if (num2 > num3 ) {
            System.out.println("el numero 2 es mayor " + num2 );
        }
        if (num3 > num1) {
            System.out.println("el numero 1 es menor " + num1);
        }
    }

    public static void elseif() {
        var num = 2;

        if (num == 1) {
            System.out.println("numero uno");
        } else if (num == 2) {
            System.out.println("numero dos ");
        } else if (num == 3) {
            System.out.println("numero tres");
        } else if (num == 4) {
            System.out.println("numero cuatro");
        }
    }

        public static void ifStation(){
            int month = 4;

            if(month == 1) {
                System.out.println("es invierno");
            }else if(month == 2) {
                System.out.println("es verano");
            }
        }

        public static void switchEx() {
            var num = 5;

            switch (num) {
                case 1:
                    System.out.println("numero 1 "+num);
                    break;
                case 2:
                    System.out.println("numero 2 " + num);
                    break;
                case 3:
                    System.out.println("numero 3 "+num);
            }
        }
        public static void bucles(){
        var count = 0;
        while (count < 3 ){
            count ++;
            System.out.println(count);
        }
    }
    public  static void contraseña() {
        Scanner digitar = new Scanner(System.in);
        var palabraSecreta = "hola";
        String palabra;

        do {
            System.out.println("digite la palabra secreta ");
            palabra = digitar.nextLine();

        }while(!palabra.equals(palabraSecreta));
        System.out.println("es correcta");
    }
}


