package estructurasDeControl;

public class Condicionales {
    public void condicionIf(){

        var num1 = 10;
        var num2 = 20;
        var num3 = 30;
        if (num1>num2 ){
            System.out.println("El primer numero es mayor que el segundo");
        }
        else {
            System.out.println("El segundo numero es mayor que el primero");
        }
        if (num2>num3){
            System.out.println("El segundo numero es mayor que el tercero");
        }
        else {
            System.out.println("El tercer numero es mayor que el segundo");
        }
    }
    public void condicionElseIf(){
        var num = 4;
        var numeroTexto = "Numero desconocido";

        if (num == 1){
            numeroTexto = "Numero uno";
        }
        else if (num == 2){
            numeroTexto = "Numero Dos";
        }
        else if (num == 3){
            numeroTexto = "Numero tres";
        }
        else if (num == 4){
            numeroTexto = "Numero cuatro";
        }
        else {
            System.out.println("Numero no encontrado");
        }
        System.out.println(numeroTexto);
    }
    public void condicionEstacion(){
        var mes = 4;
        var estacion = "Estacion desconocida";
        
        if (mes == 1 || mes == 2 || mes ==12){
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
    }
    public void metodoSwitch(){
        var num = 3;
        var numeroTexto = "Valor desconocido";
        
        switch (num){
            case 1:
                numeroTexto ="Numero Uno";
                break;
            case 2:
                numeroTexto ="Numero Dos";
                break;
            case 3:
                numeroTexto ="Numero Tres";
                break;
            case 4:
                numeroTexto ="Numero Cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    public void switchString(){
        var fruta = "Manzana";
        var texto = "Valor desconocido";

        switch (fruta){
            case "Naranja":
                texto ="Naranja";
                break;
            case "Pera":
                texto="Pera";
                break;
            case "Limon":
                texto ="Limon";
                break;
            case "Manzana":
                texto ="Manzana";
                break;
            default:
                texto = "Caso no encontrado";
        }
        System.out.println("fruta = " + texto);
    }
}
