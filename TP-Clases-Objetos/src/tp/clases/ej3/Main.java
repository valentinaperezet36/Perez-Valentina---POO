package tp.clases.ej3;

class Auto {
    private final String marca;
    private final String modelo;
    private final String color;

    Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    void mostrarDatos() {
        System.out.println("Tengo un " + marca + " modelo " + modelo
                + " de color " + color + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Renault", "Sandero", "bordó");
        Auto auto2 = new Auto("Honda", "Civic", "azul");
        Auto auto3 = new Auto("Fiat", "Cronos", "blanco");

        auto1.mostrarDatos();
        auto2.mostrarDatos();
        auto3.mostrarDatos();
    }
}
