package estructurasDeControl;

public class Principal {

    public static void main(String[] args) {
        Condicionales imprimirCondicionales = new Condicionales();
        Ciclos imprimirCiclos = new Ciclos();

        imprimirCondicionales.conditionIf();
        imprimirCondicionales.conditionElseIf();
        imprimirCondicionales.conditionSwitch();

        imprimirCiclos.cicloWhile();
        imprimirCiclos.login();

    }
}
