package ejercicio2;

public class Docente extends Persona {
    private String materia;

    // Persona inicializa el nombre y la edad.
    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    // Muestra los datos heredados y la materia.
    public void mostrarInformacion() {
        System.out.println("Docente: " + getNombre() + " | Edad: " + getEdad()
                + " | Materia: " + materia);
    }
}
