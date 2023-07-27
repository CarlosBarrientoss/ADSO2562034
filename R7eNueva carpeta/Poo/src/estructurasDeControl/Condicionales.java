package estructurasDeControl;

public class Condicionales {
    public void conditionIf(){

        var num1 = 10;
        var num2 = 20;
        var num3 = 30;

        if(num1>num2){
            System.out.println("El primer numero es mayor que el segundo");

        }else {
            System.out.println("El segundo numero es mayor que el primero");
        }

        if(num2>num3){
            System.out.println("El segundo numero es mayor que el tercero");

        }else {
            System.out.println("El tercer numero es mayor que el segundo");
        }

    }

    public void conditionElseIf(){

        var n = 20;

        if(n == 1){
            System.out.println("El numero es UNO");
        }

        else if(n == 2){
            System.out.println("El numero es DOS");
        }

        else if(n == 3){
            System.out.println("El numero es TRES");
        }

        else if(n == 4){
            System.out.println("El numero es CUATRO");
        }

        else if(n == 5){
            System.out.println("El numero es CINCO");
        }

        else if(n == 6){
            System.out.println("El numero es SEIS");
        }

        else if(n == 7){
            System.out.println("El numero es SIETE");
        }

        else if(n == 8){
            System.out.println("El numero es OCHO");
        }

        else if(n == 9){
            System.out.println("El numero es NUEVE");
        }

        else {
            System.out.println("ERA UN NUMERO DEL 1 AL 9 CAREMONDA");
        }
    }

    public void conditionEstacion(){


    }

    public void conditionSwitch() {

        var fruta = "Manzana";
        var numeroTexto = "Valor desconocido";

        switch (fruta) {
            case "Naranja":
                numeroTexto = "La fruta es una naranja";
                break;
            case "Pera":
                numeroTexto = "La fruta es una Pera";
                break;

            case "Manzana":
                numeroTexto = "la fruta es una manzana";
                break;

            case "Uva":
                numeroTexto = "La fruta es una uva";
                break;
            case "Pomarosa":
                numeroTexto = "La fruta es una Pomarosa";
                break;
            default:
                numeroTexto = "Condicion no encontrada";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
