
package estructurasDeControl;


public class Condicionales {


    public void condicionIf() {

        var num1 = 10;
        var num2 = 20;
        var num3 = 30;

        // if (num1<num2) {
        // System.out.println("El num1 es menor");
        // }else if (num2>num3) {
        // System.out.println("El num2 es mayor");
        // }else{
        // System.out.println("El num3 es mayor");
        // }

        if (num1<num2){
            System.out.println("El num1 es menor");
        }
        if (num2>num3){
            System.out.println("El num2 es Mayor");
        }

        if (num3>num2){
            System.out.println("El num3 es Mayor");
        }
        //////////////////////////////////////////////////////



    }


    public void elseIf(){

        var numero =4;
        var numerotexto = "Numero desconocido";
        if (numero == 1){
            System.out.println("numeroTexto =" + numero);
        }else if (numero == 2){
            System.out.println("numeroTexto =" + numero);
        }else if (numero == 3){
            System.out.println("numeroTexto =" + numero);

        }else if (numero == 4){
            System.out.println("numeroTexto =" + numero);
        }else{
            System.out.println("Numero no encontrado");
        }




    }

    public void estacionDelAño(){

        var mes = 4;
        var estacion = "Estacion desconocida";

        if (mes == 1  || mes == 2     || mes == 12){
            estacion = "Invierno";
        }else if (mes == 3  || mes == 4  || mes == 5){
            estacion = "Primavera";
        }else if (mes == 6  || mes == 7     || mes == 8){
            estacion = "Verano";
        }else if (mes == 9  || mes == 10     || mes == 11){
            estacion = "Otonio";
        }
        System.out.println("Estacion = " + estacion);

    }


    public void swicth(){
        var numero = 5;
        var numeroTexto = "Valor Desconocido";

        switch(numero){
            case 1:
                System.out.println(numeroTexto = "Numero uno");
                break;
            case 2:
                System.out.println(numeroTexto = "Numero dos");
                break;
            case 3:
                System.out.println(numeroTexto = "Numero tres");
                break;
            case 4:
                System.out.println(numeroTexto = "Numero cuatro");
            default:
                System.out.println(numeroTexto = "Caso no encontrado");
            }
        System.out.println("Numero texto = "+ numeroTexto);
    }

    public void frutas(){
        var fruta = "Manzana";

        switch(fruta){
            case "Manzana":
                System.out.println("El color de la manzana es Rojo");
                break;
            case "Pera":
                System.out.println("El color de la pera es verde");
                break;
            case "Mora":
                System.out.println("El color de la mora morada");
                break;
            case "Pomarrosa":
                System.out.println("El color de la pomarrosa es Rosado");
            default:
                System.out.println("Condicion no encontrada");
        }
        System.out.println("Fin");

    }

}

