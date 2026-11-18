package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Laura", 34, "Programación");
        Preceptor preceptor = new Preceptor("Martín", 29, "5° 1°");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        // Cambia la edad del docente con el setter de Persona.
        docente.setEdad(35);
        System.out.println("Después de actualizar la edad del docente");
        docente.mostrarInformacion();
    }
}
