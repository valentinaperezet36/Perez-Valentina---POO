package tp.clases.ej1;

class Persona {
    String nombre;
    int edad;

    void mostrarDatos() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Camila";
        persona1.edad = 19;

        Persona persona2 = new Persona();
        persona2.nombre = "Tomás";
        persona2.edad = 22;

        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}
