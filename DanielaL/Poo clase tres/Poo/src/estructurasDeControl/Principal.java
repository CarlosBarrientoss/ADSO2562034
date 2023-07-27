package estructurasDeControl;

public class Principal {
    public static void main(String[] args) {

        Condicionales imprimirCondicionales = new Condicionales();
        imprimirCondicionales.condicionIf();
        imprimirCondicionales.condicionElseIf();
        imprimirCondicionales.condicionEstacion();
        imprimirCondicionales.metodoSwitch();
        imprimirCondicionales.switchString();

        Ciclos imprimirCiclos = new Ciclos();
        imprimirCiclos.cicloWhile();
        imprimirCiclos.login();
    }
}
