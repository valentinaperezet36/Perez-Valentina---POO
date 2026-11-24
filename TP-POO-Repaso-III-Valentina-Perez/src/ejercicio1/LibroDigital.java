package ejercicio1;

public class LibroDigital extends MaterialDigital {
    // El constructor de MaterialDigital guarda el título.
    public LibroDigital(String titulo) {
        super(titulo);
    }

    // Sobrescribe la descripción para un libro digital.
    @Override
    public void mostrarDescripcion() {
        System.out.println(getTitulo() + " - Se puede leer en pantalla");
    }
}
