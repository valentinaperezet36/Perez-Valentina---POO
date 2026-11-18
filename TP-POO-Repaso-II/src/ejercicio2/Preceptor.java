package ejercicio2;

public class Preceptor extends Persona {
    private String cursoAsignado;

    // Persona inicializa el nombre y la edad.
    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    // Muestra los datos heredados y el curso.
    public void mostrarInformacion() {
        System.out.println("Preceptor: " + getNombre() + " | Edad: " + getEdad()
                + " | Curso asignado: " + cursoAsignado);
    }
}
