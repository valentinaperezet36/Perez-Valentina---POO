package ejercicio1;

public class Main {
    // Crea un material de cada tipo y muestra sus descripciones.
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("El principito");
        Audiolibro audiolibro = new Audiolibro("Ficciones");

        libro.mostrarDescripcion();
        audiolibro.mostrarDescripcion();
    }
}
