package ejercicios;

import java.util.Scanner;

public class principal {

    public static void CalculaPrecio() {
        System.out.println("PROGRAMA PARA CALCULAR EL PAGO DE UN TRABAJADOR ");
        System.out.println("------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE LOS DIAS TRABAJADOS ");
        int dias = sc.nextInt();
        System.out.println("DIGITE CUANTO TE PAGAN POR DIA ");
        int pagos = sc.nextInt();

        int solucion = dias * pagos;
        System.out.println("te tienen que pagar ");
        System.out.println(solucion + "   mil pesos");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public static void IMC() {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            // Solicitar los datos al usuario
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            // Calcular el IMC
            double imc = peso / altura;

            // Mostrar el resultado
            System.out.printf("Su IMC es: " + imc);

            // Preguntar si desea continuar
            System.out.print("¿Desea calcular el IMC nuevamente? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
        System.out.println("~~~~~~~~~");

    }

    public static void lote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo del lote (en metros): ");
        double largo = scanner.nextDouble();

        System.out.print("Ingrese el ancho del lote (en metros): ");
        double ancho = scanner.nextDouble();

        // Calcular el área
        double area = (largo * ancho);

        // Mostrar el resultado
        System.out.printf("El área del lote rectangular es " + area);

        System.out.println("~~~~~~~~~~");

    }

    public static void nota() {
        double nota1 = 3.0;
        double nota2 = 4.5;
        double nota3 = 5.0;
        double examenFinal = 4.5;

        // Calcular el 70% de las notas
        double porcentajeNotas = (nota1 + nota2 + nota3) * 70;
        double resultado1 = porcentajeNotas / 100;

        // Calcular el 30% del examen final
        double porcentajeExamenFinal = examenFinal * 30;
        double resultado2 = porcentajeExamenFinal / 100;

        // Mostrar los resultados
        System.out.println("El 70% de la suma de las notas es: " + resultado1 + "%");
        System.out.println("El 30% del examen final es: " + resultado2 + "%");

        System.out.println("~~~~~~~~~~");

    }

    public static void curso() {

        int[] edades = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("digite la edad del estudiante " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
        }

        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        int edadPromedio = sumaEdades / edades.length;

        // Mostrar el resultado
        System.out.println("La edad promedio del curso es: " + edadPromedio + " años");

        System.out.println("~~~~~~~~~~~");

    }

    public class ConversorMoneda {

        public static void main(String[] args) {
            // Tipo de cambio: 1 USD = 3500 COP
            final double TIPO_CAMBIO = 3500;

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de dólares: ");
            double dolares = scanner.nextDouble();

            double pesosColombianos = dolares * TIPO_CAMBIO;

            System.out.println(dolares + " dólares son equivalentes a " + pesosColombianos + " pesos colombianos.");
            System.out.println("~~~~~~");
        }

    }

    // desarrolla un sistema que muestre por consola el nombre de un producto,el precio real
    //y el iva
    public static void iva() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("nombre del producto ");
        String producto = sc.nextLine();
        System.out.println("precio del producto ");
        double precio =sc.nextInt();
                 System.out.println("el precio del producto es ");
       double solucion = (precio * 0.19);
        System.out.println("el iva es"+ solucion);

//        

        
        }

        
    }
