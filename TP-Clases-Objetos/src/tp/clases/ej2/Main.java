package tp.clases.ej2;

class Libro {
    private final String titulo;
    private final String autor;
    private final int anio;

    Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    void mostrarDatos() {
        System.out.println("\"" + titulo + "\" - " + autor + " (" + anio + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El túnel", "Ernesto Sabato", 1948);
        Libro libro2 = new Libro("Los peligros de fumar en la cama", "Mariana Enríquez", 2009);

        libro1.mostrarDatos();
        libro2.mostrarDatos();
    }
}
